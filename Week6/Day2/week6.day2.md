09:00 to 10:00 -> ReadExcel&Excel Integrations with TestCase 
10:00 to 10:30 -> Breakout(20mins) + Break(10 mins)
10:35 to 11:00 -> Common integration
11:00 to 12:00 -> Cucumber Introduction (Feature file&Step def and Runner class) 
12:00 to 12:20 ->Breakout

Read Values from Excel:
 PreRequisites:
  -ApachePoi Library

  open WB--->interact with WS--->identify the row to interact with--->identify the cell to interact with-->close the WB

  To create a data folder:
   under the project do right click --->new folder--->data-->do right click--->reveal file exploree--->double click the data--->right click--->new-->excelworksheet-->rename it--->open set the datas and close the wb

  1)Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount 
  String[][] data = new String[rowCount][columnCount];

2)Push=> stringCellValue to the Array 
data[i-1][j]=stringCellValue;

3)Close the workbook and return the data 
wBook.close();
 return data;

4)Change main method to a normal static method

public static String[][] readExcel(){ }
5)Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data 
* * * @DataProvider(name="fetchData")
 public String[][] sendData() throws IOException { 
    return ReadExcel.readData();
 }

Common integration:
@BeforeTest--->setValues(choosing the file)
 @DataProvider--->sendData(fetch data)
  @BeforeMethod---->preconditions()
   @Test--->testcase excecution
 @AfterMethod--->postconditions()

 How to create a feature file:
  1.create a resources folder under src/test
  2.do right click on resorces folder--->create a new package features.
  3.do right click on features and create a new file with extension feature