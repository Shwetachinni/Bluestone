package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;


import Generic.Open_closeAppln;

import POM.Scenar_8;

public class Scenario_8 extends Open_closeAppln {

		@Test
		public void Test_script7() throws InterruptedException, IOException
		{
			
		
		 Scenar_8 h1=new Scenar_8(driver);
		 h1.click_Mousover(driver);
		 h1.click_kada(driver);
		 h1.kada_5(driver);
		 h1.click_size(driver);
		 h1.select_size(driver);
		 Thread.sleep(3000);
		 h1.buy_now(driver);
		 
		
		
}
	}

