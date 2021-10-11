ReadMe.txt			
---------------------------------------------------------------------
1. UIAssignment : 
---------------------------------------------------------------------
1.Open a browser of your choice : Chrome
2.Navigate to ​StackOverflow​ (​https://stackoverflow.com/​)
3.Go to the “Browse Questions” section.
4.Click on the “Tags” in the left section.
5.Click on “Name”
6.Get the tag ​name​ which is having max questions count on the first page (pagination).(Display “Tag Name” and “Questions” Count of that particular tag in the Result)
7.Close Browser

---------------------------------------------------------------------
Basic requirements : 

1. Command line execution - Machine should have jdk/jre 1.8+ , maven , setup.
2. IDE execution : eclipse/intelliJ - testng plugin
---------------------------------------------------------------------
Tech : 

1. Build Tool : maven 
2. Testing framework : TestNg , (UI - Selenium)
3. Programming Language : Java ( jdk 1.8)
---------------------------------------------------------------------
Package/Folder Structure: 
-  
	+src
		+/main/java
			+common
				+Keyword.java
			+pageObject
				+CommonAction.java
			+RetryAnalyzer
				+MyAnnotationTransfer.java
				+RetrySetup.java
			+utility
				+BaseClass.java
				+BasePage.java
				+Config.java 
				+Initializer.java
	+src
		+/test/java
			+testCase
				+GetTagWithMaxQueCount.java
- target
- pom.xml
- Screenshot
- Screenshot Backup
- Console Logs
---------------------------------------------------------------------
Steps to follow : 

1. Please extract zip/tar file. 
2. Go inside folder , you will see pom.xml file
3. Please run below command to execute first assignment : 

	command : mvn -Dtest=GetTagWithMaxQueCount test
	
4. During first execution it will resolve lib depedencies and then it will trigger execution over chrome browser. 
5. Based on network speed execution time may different , default time out for webelemtnts is 60 secs. 
   Please find the attached copy  of Sample output (during my command line run was found below results.)
   
   Tag Name : headless-ui
   Questions : 3	
---------------------------------------------------------------------   
   	
Additional Things Covered :
 
 1. Added the retry analyzer to trigger the failed testcase n number of times (Currently set as 3)
 2. Implemented log4j logs and stored it in text file.
 3. Screenshot taken whenever neccesary and taken backup for the same.

Note : I can add more functionality as well as per requirements.

	a. We can add snapshot comparison to validate the data based on requirements.
	b. Change the pattern/naming convention for snapshot.
	c. Implement functionality to take screenshot whenever testcase get failed.
	d. Integrate the complete suite with Jenkins.