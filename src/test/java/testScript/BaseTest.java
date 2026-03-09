package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;

public class BaseTest {

	@Test
	public void tc001() 
	{
		
		WebDriver driver = new ChromeDriver();
		LoginPageObject lp = new LoginPageObject(driver);
		
		lp.launchfb();
		lp.doLogin("Hello@gmail.com","Pass@1234");
		
		
	}

}
