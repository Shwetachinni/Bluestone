package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.Diamand_page;
import POM.HomePage;

public class script1 extends Open_closeAppln{

	@Test
	public void TestScript() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.click_Mouseover(driver);
		
		Diamand_page dp=new Diamand_page(driver);
		dp.Get_DefaultPrice();
		Thread.sleep(3000);
		
		dp.Click_populor(driver);
		Thread.sleep(3000);
		
		dp.Get_LToHPrice();
		Thread.sleep(3000);
		
		dp.Compare_price();
	}

}
