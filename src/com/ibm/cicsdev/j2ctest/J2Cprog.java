/* Licensed Materials - Property of IBM                                   */
/*                                                                        */
/* SAMPLE                                                                 */
/*                                                                        */
/* (c) Copyright IBM Corp. 2016 All Rights Reserved                       */
/*                                                                        */
/* US Government Users Restricted Rights - Use, duplication or disclosure */
/* restricted by GSA ADP Schedule Contract with IBM Corp                  */
/*                                                                        */

package com.ibm.cicsdev.j2ctest;

import java.text.MessageFormat;
import com.ibm.cics.server.InvalidProgramIdException;
import com.ibm.cics.server.InvalidRequestException;
import com.ibm.cics.server.Program;
import com.ibm.cics.server.Task;
import com.ibm.cicsdev.bean.J2CCommareaWrapper;

public class J2Cprog {

	public final static String proglink = "EDUPGM"; // Linked to COBOL program

	public static void main(String[] args) {

		// Get details about our current CICS task
		Task task = Task.getTask();
		task.out.println("  Starting J2Cprog");

		// Instantiate new wrapper for the input and output commareas
		J2CCommareaWrapper cwIn = new J2CCommareaWrapper();
		J2CCommareaWrapper cwOut = new J2CCommareaWrapper();

		// Set the input data fields
		Short binarydigit = 1;
		String charstring = "hello";
		Short numericstring = 1234;
		Integer packeddigit = 123456789;
		Integer signedpackeddigit = -100;
		String bool = "1";

		cwIn.setBinary__digit(binarydigit);
		cwIn.setCharacter__string(charstring);
		cwIn.setNumeric__string(numericstring);
		cwIn.setPacked__digit(packeddigit);
		cwIn.setSigned__packed(signedpackeddigit);
		cwIn.setBool(bool);

		// Create a reference to the CICS program
		Program prog = new Program();
		prog.setName(proglink);

		// Create byte array for input commarea from wrapper
		byte[] commarea = cwIn.getBytes();

		try {

			// Link to target CICS program
			prog.link(commarea);

			// Build output record from updated commarea

			cwOut.setBytes(commarea);

			// Catch specific JCICS exception
		} catch (InvalidProgramIdException e) {

			String msg = "ERROR: Unknown CICS Program from {0} with msg({1})";
			task.out.println(MessageFormat.format(msg, proglink, e.getMessage()));

			// Catch any other exception and force a rollback of CICS UOW
		} catch (Exception e) {
			String msg = "ERROR: Exception on link to {0} with msg({1})";
			task.out.println(MessageFormat.format(msg, proglink, e.getMessage()));
			// Rollback the CICS Task
			try {
				task.rollback();
			} catch (InvalidRequestException e1) {
				// If this fails, then throw Runtime Exception
				throw new RuntimeException(e1);
			}
		}

		String msg = "Returned from {0} with rc({1}) {2}";
		task.out.println(MessageFormat.format(msg, proglink,
		        cwOut.getResult__code(), cwOut.getResult__text()));

	}

}
