
9:00 to 10:00 --->Cucumber stepdefinition and runner class
10:00 to 10:30 ---> Breakout+Break
10:30 to 11:15 ---> Parametrization
11:15 to 11:45 ---> Multiple data
11:45 to 12:15 ---> Hooks implementation and tags

static Parameterization:
1)surround the data within a single quote in the feature file.
2)in the stepDefinition class,red the data in the test step as string {string}
3)Pass the i/p arguments to the method and replace the hardcoded value

Steps to pass multiple data to a scenario using Scenario Outline and Examples:
Create a feature file called CreateLead.feature and write all the BDD steps
In Scenario Outline replace the data with <> and pass a name inside it Enter the companyname as
In StepDefinition on the top of that particular method replace the parameterized data with (.)$ @Given("Enter the companyname as (.*)$")