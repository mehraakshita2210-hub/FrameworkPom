package testScript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityPackage.ExcelUtility;


public class BaseTest extends ReuseableTestComponents {

	@Test(enabled = false)
	public void tc001() throws IOException 
	{
		launchAndLogin();
	}
	
	@Test(dataProvider = "excelData")
	public void tc002(String username, String password) 
	{
		System.out.println(username + " " + password);
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() throws IOException
	{
		String filepath = "C:\\Users\\Akshita Mehra\\OneDrive\\Desktop\\excelnew\\myexcel.xlsx";
		String sheetname = "mysheet";
		return ExcelUtility.readExcelData(filepath, sheetname);
	}
	
}



