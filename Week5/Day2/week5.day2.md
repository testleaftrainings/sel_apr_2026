9:00 to 9:45 --->Actions
9:45 to 10:30 --->TestNG Basics & Seq execution
10:30 to 10:50 --->Breakout
10:50 to 11:00 --->Break
11:00 to 11:30 --->Parallel  execution
11:30 to 12:00 --->TestNg Annotations

PreRequisites:
TestNG plugins--for compiling and executing the testcases.
dependencies--developing for script

steps for converting normal script to TestNG:
 1)convert main mtd into normal method a)remove static,string args b)remove main and give a valid method name(mthd name should not be same as class name) 2)add @Test before the method and import it

To create a snippet do ctrl+shift+p then type configure snippet--->new global snippet--->give the file name,delete the already existing data and add the below file



{
  "TestNG XML": {
    "prefix": "testngxml",
    "body": [
      "<!DOCTYPE suite SYSTEM \"https://testng.org/testng-1.0.dtd\" >",
      "<suite name=\"DemoSuite\">",
      "    <test name=\"DemoTests\">",
      "        <classes>",
      "            <class name=\"com.demo.SampleTest\"/>",
      "        </classes>",
      "    </test>",
      "</suite>"
    ],
    "description": "Generate a TestNG XML template"
  }
}

Create testng.xml File Right click project → New File → testng.xml

Usage of Snippets Open any XML file Type → testngxml Press Enter

Open Maven Project in Terminal Right click on project Select → Open in Integrated Terminal Type → mvn clean test Press Enter

Verify Output Check Terminal logs Verify that the testcases should be executed in sequential manner Verify test execution status (PASS/FAIL)