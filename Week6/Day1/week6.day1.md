09:00 - 10:15 ->Parallel Execution & Annotations
10:15 - 10:30 ->  Break
10:30 - 11:00 ->  StaticParameterization
11:00 - 11:20 -> Breakout
11:20 - 12:00 -> Dynamic Parameterization
12:00 -12:20  ->BreakOut


TestNG Annotations:
 @BeforeSuite--->one time setup before the enire framework is started
  @BeforeTest--->testlevel info
   @BeforeClass--->tescaseDetails
    @BeforeMethod--->preconditions
      @Test--->testcases
    @AfterMethod--->postconditions
  @AfterClass
 @AfterTest
@AfterSuite

Parameterization:
 Ability to run a testMethod multiple number of times with different sets of data,
Static:
data which is common across the testcases to be hardcoded.
2)dynamic :data varies or differs across all the testcases.

Steps to implement Static Parameterization: 
Identify the data that are common across all the test cases 
1.Add parameter tag for each data in the XML file ex: url,username,password ,browser 
2.Map the parameters in the class using @Parameters ex: @Parameters({"url","username", "password"})
 Note: The name should exactly match the names in the xml 
 3.Use that parameters inside the method using arguments
Note: Sequence matters but the name of the arguments does not matter 
 4.Finally, replace the arguments with the hardcoded values 
 Note: You should always run from the xml file when you use parameters

Dynamic Parameterization: 
1.Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
2.Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3.Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
4.Return data back to the calling method
5.Receive the data in the testcase uding dataProvider attribute 
6. Pass input arguments to the test method and replace all the hardcoded data