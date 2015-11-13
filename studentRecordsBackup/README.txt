CS542 Design Patterns
Fall 2015
PROJECT 3 README FILE

Due Date: Saturday, November 7, 2015
Submission Date: Saturday, November 7, 2015
Grace Period Used This Project: N/A
Grace Period Remaining: N/A
Author: Vishnu Ravindra
e-mail: vravind1@binghamton.edu

PURPOSE:
Java code to create a BST and store it in two other backup trees using observer pattern.

PERCENT COMPLETE:
I believe that I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:
None.

BUGS:
None.

FILES:
The following files are included in this project,

BST.java, this file is used in creating BST
Node.java, this file is used in creating node
BSTI.java, this is an interface which has methods used while constructing BST
CommonInterface.java, this is an interface which has methods for both subject and listener
ListenerI.java, this is an interface which has methods for listener
SubjectI.java, this is an interface which has methods for subject.
BSTBuilder.java, this file is used to get a line from input from the file.
Driver.java, this file contains the main method.
input.txt, this is the input file for this project which has integers.
README.txt, this file is the read me file which you are reading it now.

SAMPLE OUTPUT:

Assuming you are in the directory containing this README,

GENERAL INSTRUCTION:

## To clean:
ant -buildfile build.xml clean

## To compile: 
ant -buildfile build.xml all

## To run by specifying arguments from command line [similarly for the 2nd argument and so on ...]
ant -buildfile build.xml run -Darg0=firstarg 

## To run by specifying args in build.xml
ant -buildfile build.xml run b

## To create tarball for submission
ant -buildfile build.xml tarzip



TO COMPILE:
remote07:~/DP/Assignment3/vishnu_ravindra/studentRecordsBackup> ant -buildfile build.xml all
Buildfile: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/build.xml

prepare:
    [mkdir] Created dir: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/BUILD
    [mkdir] Created dir: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/BUILD/classes

studentRecordsBackup:
    [javac] /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/build.xml:48: warning: 'includeantruntime' was not set, defaulting to build.sysclasspath=last; set to false for repeatable builds
    [javac] Compiling 8 source files to /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/BUILD/classes

compile_all:

all:

BUILD SUCCESSFUL
Total time: 2 seconds

TO RUN:
remote07:~/DP/Assignment3/vishnu_ravindra/studentRecordsBackup> ant -buildfile build.xml run -Darg0=input.txt -Darg1=5
Buildfile: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/build.xml

jar:
    [mkdir] Created dir: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/BUILD/jar
      [jar] Building jar: /import/linux/home/vravind1/DP/Assignment3/vishnu_ravindra/studentRecordsBackup/BUILD/jar/studentRecordsBackup.jar

run:
     [java] Main Tree:
     [java] 123
     [java] 456
     [java] 789
     [java] Backup 1 Tree:
     [java] 123
     [java] 456
     [java] 789
     [java] Backup 2 Tree:
     [java] 123
     [java] 456
     [java] 789
     [java] Sum of Main tree: 1368
     [java] Sum of Backup 1: 1368
     [java] Sum of Backup 2: 1368
     [java] Main Tree:
     [java] 128
     [java] 461
     [java] 794
     [java] Backup 1 Tree:
     [java] 128
     [java] 461
     [java] 794
     [java] Backup 2 Tree:
     [java] 128
     [java] 461
     [java] 794

BUILD SUCCESSFUL
Total time: 1 second

EXTRA CREDIT:
N/A

BIBILOGRAPHY:
https://docs.oracle.com/javase/8/
https://stackoverflow.com

ACKNOWLEDGMENT:
I thank professor for extending the deadline and giving more insight about this project.