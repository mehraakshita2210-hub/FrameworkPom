package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	
		WebDriver driver;
		
		public LoginPageObject(WebDriver driver) 
		{
			this.driver = driver;	
		}


		public LoginPageObject() {
			// TODO Auto-generated constructor stub
		}


		public void launchfb() 
		{
			
			driver.get("https://www.facebook.com/");
		}
		
		
		public void doLogin(String un, String pw ) 
		{
			
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement pass = driver.findElement(By.cssSelector("input[name='pass']"));
		WebElement lgbutton = driver.findElement(By.cssSelector("div[class='html-div xdj266r xat24cr xexx8yu xyri2b x18d9i69 x1c1uobl x6s0dn4 x78zum5 xl56j7k x1e0frkt xf0ucvx xx2axb6']"));
		
		email.sendKeys(un);
		pass.sendKeys(pw);
		lgbutton.click();
			
		}
		
		
		


}
