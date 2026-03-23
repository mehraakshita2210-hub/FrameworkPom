package testScript;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilityPackage.ExcelUtility;
import utilityPackage.ScreenshotUtility;


public class BaseTest extends ReuseableTestComponents {

	@Test(dataProvider = "excelData")
	public void tc001(String username, String password) throws IOException 
	{	
		Assert.fail();
		Assert.assertTrue(false);
		launchAndLogin(username, password);
		ScreenshotUtility su = new ScreenshotUtility(driver);
		su.takeScreenshot();
	}
	
	@Test(enabled = false)
	public void tc002() 
	{
		System.out.println("Hello");
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() throws IOException
	{
		String filepath = "D:\\MagicEdtechAutomation\\FrameworkPom\\ExcelFile\\myexcel.xlsx";
		String sheetname = "mysheet";
		return ExcelUtility.readExcelData(filepath, sheetname);
	}
	
}



