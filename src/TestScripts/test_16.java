package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_16;

public class test_16 extends Open_closeAppln{
	@Test
	public void select_coins() throws InterruptedException
	{
		pom_16 p1=new pom_16(driver);
		p1.click_Mousover(driver);
		Thread.sleep(3000);
		p1.one_click();
		p1.getname();
	}
}
