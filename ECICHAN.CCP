      **********************************************************
      *
      * Module Name        ECICHAN.CCP
      *
      * CICS back-end Channel/container sample for use with Java client EciChant
      *
      * PIW Aug 2008 v1.0
      * PIW Jun 2009 v1.1 - Added FLENGTH for CICS TS V4.1
      **************************************************************************
      * Licensed Materials - Property of IBM
      *
      * Copyright IBM Corporation 2007,2008 All Rights Reserved
      *
      * US Government Users Restricted Rights - Use, duplication, or disclosure
      * restricted by GSA Schedule Contract with IBM Corporation
      *
      *
      * The following code is sample code created by IBM Corporation. This sampl
      * code is not part of any standard IBM product and is provided to you sole
      * for the purpose of assisting you in the development of your applications
      * code is provided 'AS IS', without warranty or condition of any kind. IBM
      * shall not be liable for any damages arising out of your use of the sampl
      * code, even if IBM has been advised of the possibility of such damages.
      **************************************************************************



       IDENTIFICATION DIVISION.
       PROGRAM-ID. ECICHAN.

       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.

      *  Container name declarations
      *  Channel and container names are case sensitive
       01 DATE-CONT          PIC X(16) VALUE 'CICSTIME'.
       01 INPUT-CONT         PIC X(16) VALUE 'INPUTDATA'.
       01 OUTPUT-CONT        PIC X(16) VALUE 'OUTPUTMESSAGE'.
       01 LENGTH-CONT        PIC X(16) VALUE 'INPUTDATALENGTH'.
       01 CCSID-CONT         PIC X(16) VALUE 'CHANNELCCSID'.
       01 ERROR-CONT         PIC X(16) VALUE 'ERRORDATA'.


      *  Data fields used by the program
       01 INPUTLENGTH        PIC S9(8) COMP-4.
       01 DATALENGTH         PIC S9(8) COMP-4.
       01 CURRENTTIME        PIC S9(15) COMP-3.
       01 ABENDCODE          PIC X(4) VALUE SPACES.
       01 CHANNELNAME        PIC X(16) VALUE SPACES.
       01 INPUTSTRING        PIC X(72) VALUE SPACES.
       01 OUTPUTSTRING       PIC X(72) VALUE SPACES.
       01 RESPCODE           PIC S9(8) COMP-4 VALUE 0.
       01 RESPCODE2          PIC S9(8) COMP-4 VALUE 0.
       01 CCSID              PIC S9(8) COMP-4 VALUE 0.
       01 CCSID-DISP         PIC Z(8) DISPLAY VALUE SPACES.
       01 DATE-TIME.
         03 DATESTRING         PIC X(10) VALUE SPACES.
         03 TIME-SEP           PIC X(1) VALUE SPACES.
         03 TIMESTRING         PIC X(8) VALUE SPACES.
       01 ERR-RECORD.
         03 ERRORCMD           PIC X(16) VALUE SPACES.
         03 ERRORSTRING        PIC X(32) VALUE SPACES.


       PROCEDURE DIVISION.
      *  -----------------------------------------------------------
       MAIN-PROCESSING SECTION.
      *  -----------------------------------------------------------

      *  Get name of channel
           EXEC CICS ASSIGN CHANNEL(CHANNELNAME)
                            END-EXEC.

      *  If no channel passed in, terminate with abend code NOCH
           IF CHANNELNAME = SPACES THEN
               MOVE 'NOCH' TO ABENDCODE
               PERFORM ABEND-ROUTINE
           END-IF.

      *  get code page of channel
           EXEC CICS GET CONTAINER(INPUT-CONT)
                            CHANNEL(CHANNELNAME)
                            CCSID(CCSID)
                            CONVERTST(DFHVALUE(NOCONVERT))
                            NODATA
                            FLENGTH(DATALENGTH)
                            RESP(RESPCODE)
                            RESP2(RESPCODE2)
                            END-EXEC.
           IF RESPCODE NOT = DFHRESP(NORMAL) THEN PERFORM RESP-ERROR.
           MOVE CCSID TO CCSID-DISP.

      *  Read content and length of input container
      *  If ok then copy input data into output container
           MOVE LENGTH OF INPUTSTRING TO INPUTLENGTH.
           EXEC CICS GET CONTAINER(INPUT-CONT)
                            CHANNEL(CHANNELNAME)
                            FLENGTH(INPUTLENGTH)
                            INTO(INPUTSTRING)
                            RESP(RESPCODE)
                            RESP2(RESPCODE2)
                            END-EXEC.

           IF RESPCODE NOT = DFHRESP(NORMAL) THEN
             PERFORM RESP-ERROR
           ELSE
             STRING 'Input data was: ' DELIMITED BY SIZE INPUTSTRING
             DELIMITED BY SIZE INTO OUTPUTSTRING END-STRING
           END-IF.

      *  Return length of input data as binary data
           EXEC CICS PUT CONTAINER(LENGTH-CONT)
                            FROM(INPUTLENGTH)
                            FLENGTH(LENGTH OF INPUTLENGTH)
                            BIT RESP(RESPCODE) END-EXEC

           IF RESPCODE NOT = DFHRESP(NORMAL)
             PERFORM RESP-ERROR
           END-IF.

      *  Return output string as character data
           EXEC CICS PUT CONTAINER(OUTPUT-CONT)
                            FROM(OUTPUTSTRING)
                            FLENGTH(LENGTH OF OUTPUTSTRING)
                            CHAR
                            RESP(RESPCODE)
                            END-EXEC.

      *  Check return code
           IF RESPCODE NOT = DFHRESP(NORMAL)
             PERFORM RESP-ERROR
           END-IF.

      *  Get the current time
           EXEC CICS ASKTIME ABSTIME(CURRENTTIME)
                            END-EXEC.

      *  Format date and time
           EXEC CICS FORMATTIME
                     ABSTIME(CURRENTTIME)
                     DDMMYYYY(DATESTRING)
                     DATESEP('/')
                     TIME(TIMESTRING)
                     TIMESEP(':')
                     RESP(RESPCODE)
                     END-EXEC.

      *  Check return code
           IF RESPCODE NOT = DFHRESP(NORMAL)
               STRING 'Failed' DELIMITED BY SIZE
                            INTO DATESTRING END-STRING
           END-IF.

      *  Place current date in container CICSTIME
           EXEC CICS PUT CONTAINER(DATE-CONT)
                            FROM(DATE-TIME)
                            FLENGTH(LENGTH OF DATE-TIME)
                            CHAR
                            RESP(RESPCODE)
                            END-EXEC.
      *  Check return code
           IF RESPCODE NOT = DFHRESP(NORMAL)
             PERFORM RESP-ERROR
           END-IF.


      *  Place code page in container
           EXEC CICS PUT CONTAINER(CCSID-CONT)
                            FROM(CCSID-DISP)
                            FLENGTH(LENGTH OF CCSID-DISP)
                            CHAR
                            RESP(RESPCODE)
                            END-EXEC.

      *  Check return code
           IF RESPCODE NOT = DFHRESP(NORMAL)
             PERFORM RESP-ERROR
           END-IF.

      *  Return back to caller
           PERFORM END-PGM.

      *  -----------------------------------------------------------
      *  Handle unexpected responses
      *  -----------------------------------------------------------
       RESP-ERROR.
           MOVE SPACES TO ERRORSTRING.
           EVALUATE EIBFN
             WHEN X'0208' MOVE 'ASSIGN' TO ERRORCMD
             WHEN X'1002' MOVE 'ASKTIME' TO ERRORCMD
             WHEN X'3414' MOVE 'GET CONTAINER' TO ERRORCMD
             WHEN X'3416' MOVE 'PUT CONTAINER' TO ERRORCMD
             WHEN X'4A04' MOVE 'FORMATTIME' TO ERRORCMD
           END-EVALUATE.

           EVALUATE RESPCODE
             WHEN DFHRESP(CHANNELERR)
               MOVE '- CHANNELERR' TO ERRORSTRING
             WHEN DFHRESP(CONTAINERERR)
               MOVE '- CONTAINERERR' TO ERRORSTRING
             WHEN DFHRESP(CCSIDERR)
               MOVE '- CCSIDERR' TO ERRORSTRING
             WHEN DFHRESP(INVREQ)
               MOVE '- INVREQ' TO ERRORSTRING
             WHEN DFHRESP(IOERR)
               MOVE '- IOERR' TO ERRORSTRING
             WHEN DFHRESP(LENGERR)
               MOVE '- LENGERR' TO ERRORSTRING
           END-EVALUATE.

      *  Return error container back to caller
           EXEC CICS PUT CONTAINER(ERROR-CONT)
                            FROM(ERR-RECORD)
                            FLENGTH(LENGTH OF ERR-RECORD)
                            CHAR
                            RESP(RESPCODE)
                            END-EXEC.

      *  If this fails abort
           IF RESPCODE NOT = DFHRESP(NORMAL)
             MOVE 'EPUT' TO ABENDCODE
             PERFORM ABEND-ROUTINE.

           PERFORM END-PGM.

      *  -----------------------------------------------------------
      *  Abnormal end
      *  -----------------------------------------------------------
       ABEND-ROUTINE.
           EXEC CICS ABEND ABCODE(ABENDCODE) END-EXEC.

      *  -----------------------------------------------------------
      *  Finish
      *  -----------------------------------------------------------
       END-PGM.
           EXEC CICS RETURN END-EXEC.

