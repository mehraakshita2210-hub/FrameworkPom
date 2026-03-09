package testScript;

import java.io.IOException;
import org.testng.annotations.Test;


public class BaseTest extends ReuseableTestComponents {

	@Test
	public void tc001() throws IOException 
	{
		
		launchAndLogin();
		
	}

}
