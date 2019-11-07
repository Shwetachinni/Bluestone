package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_14;

public class test_14 extends Open_closeAppln{

	@Test
	public void select_coins() throws InterruptedException
	{
		pom_14 p1=new pom_14(driver);
		p1.click_Mousover(driver);
		Thread.sleep(3000);
		p1.one_click();
		p1.getname();
	}
}
