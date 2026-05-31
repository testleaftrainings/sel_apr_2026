package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        
        //open the WorkBook and set up the path
        XSSFWorkbook wb=new XSSFWorkbook("./selenium_learning/data/CreateLead.xlsx");
        //identify the work sheet
        XSSFSheet ws = wb.getSheetAt(0);
        //to find the rowCount
        int rowCount = ws.getLastRowNum();
        System.out.println(rowCount);
        //to find the column count
        int columnCount = ws.getRow(1).getLastCellNum();
        System.out.println(columnCount);
        //particular data
        String stringCellValue = ws.getRow(2).getCell(1).getStringCellValue();
        System.out.println(stringCellValue);

        //entire data
        for (int i = 1; i <=rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
                System.out.println(stringCellValue2);
            }
        }
        wb.close();
    }

}
