package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abcd1234@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pass@123");
		driver.findElement(By.name("login")).click();
	}

}
