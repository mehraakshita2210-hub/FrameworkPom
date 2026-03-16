package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static Object[][] readExcelData(String filepath, String sheetname) throws IOException 
	{
		FileInputStream fis = new FileInputStream(new File(filepath));
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(sheetname);
		
		int rowcount = sh.getPhysicalNumberOfRows();
		int colcount = sh.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowcount-1][colcount];
		
		
		for (int i=1;i<rowcount;i++) 
		{
			Row row = sh.getRow(i);
				for (int j=0;j<colcount;j++) 
				{
					Cell cell = row.getCell(j);
					data[i-1][j] = cell.toString();
				}	
		}
		
		wb.close();
		return data;
		
	}
}
