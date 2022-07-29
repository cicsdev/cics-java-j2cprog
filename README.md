# cics-java-j2cprog
Sample CICS Java program to use a J2C generated data binding to map a COMMAREA for linking to the CICS COBOL EDUPGM sample


## Pre-reqs

* CICS TS V5.4 or later
* Java SE 1.8 or later on the workstation
* J2C tools provided with Rational Applicaton Developer or IBM Developer for z/OS
* Eclipse with the IBM CICS SDK for Java, or any IDE that supports usage of the Maven Central artifact [com.ibm.cics:com.ibm.cics.server.](https://search.maven.org/artifact/com.ibm.cics/com.ibm.cics.server)

## Configuration

The sample class J2Cprog can be added to a OSGi plug-in project and deployed into a CICS OSGi JVM server along with the J2CCommareaWrapper class


## Reference

* More information about this sample can be found in the accompanying IBM developer tutorial [Generate Java records from COBOL with IBM Developer J2C tools](https://developer.ibm.com/tutorials/generating-java-records-from-cobol-with-rational-j2c-tools/)

* To download the COBOL EDUPGM sample see this [CICSDev Git repository](https://github.com/cicsdev/cics-java-jzosprog)
