package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_18;

public class test_18 extends Open_closeAppln {
	@Test
	public void select_coins() throws InterruptedException
	{
		pom_18 p1=new pom_18(driver);
		p1.click_Mousover(driver);
		Thread.sleep(3000);
		p1.one_click();
		p1.getname();
	}
}
