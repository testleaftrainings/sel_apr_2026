9:00 to 9:30 --->Hooks implementation & Tags
9:30 to 10:00 --->Explicit wait
10:00 to 10:20 --->ScreenShot
10:20 to 10:30 --->Break
10:30 to 11:15 --->Constructor
11:15 to 12:15 --->POM introduction
12:15 to 12:45 --->Seq & Parallel Execution


  Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags

  ExplicitWait:
  -condition based wait
  -applilicable for the particular teststep.
  -if the time is elapsed fo the condition is specified it will throw TimeOutException.

  Page Object Model:
  -Each page is considered to be the java class.
  -action in the pages are written as the methods

  ThreeLayers:
  -BaseLayer
  -Pages
  -testcases

  CreateLead for LeafTap Application:
  LoginPage--->class
  -enterUname--->method
  -enterpword-->method
  -click login--->method

  WelcomePage--->class
  -clickcrmsfa--->method

  MyHomePage--->class
  -click leads--->method

  MyLeadsPage--->class
  -click createLead

  CreateLeadPage--->class
  -companyName
  -firstname
  -Lastname
  -clicksubmit

  viewLeadsPage--->class
  -verification