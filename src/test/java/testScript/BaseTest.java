package testScript;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilityPackage.ExcelUtility;
import utilityPackage.ScreenshotUtility;


public class BaseTest extends ReuseableTestComponents {

	@Test(dataProvider = "excelData")
	public void tc001(String username, String password) throws IOException 
	{
		launchAndLogin(username, password);
		ScreenshotUtility su = new ScreenshotUtility(driver);
		su.takeScreenshot();
	}
	
	@Test(enabled = false)
	public void tc002(String username, String password) 
	{
		System.out.println(username + " " + password);
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() throws IOException
	{
		String filepath = "D:\\MagicEdtechAutomation\\FrameworkPom\\ExcelFile\\myexcel.xlsx";
		String sheetname = "mysheet";
		return ExcelUtility.readExcelData(filepath, sheetname);
	}
	
}



