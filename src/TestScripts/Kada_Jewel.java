package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Generic_screenshot;
import Generic.Open_closeAppln;
import POM.Home_Jewel;

public class Kada_Jewel extends Open_closeAppln {
	@Test
	public void Test_script7() throws InterruptedException, IOException
	{
		
	
	 Home_Jewel h1=new  Home_Jewel(driver);
	 h1.click_Mousover(driver);
	 h1.click_kada(driver);
	 h1.kada_5(driver);
	 h1.buy_now(driver);
	 Thread.sleep(3000);
	 Generic_screenshot.get_Photo(driver);
	} 
}
