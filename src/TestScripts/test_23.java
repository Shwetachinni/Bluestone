package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_23;

public class test_23 extends Open_closeAppln{
	@Test
	public void select_coins() throws InterruptedException
	{
		pom_23 p1=new pom_23(driver);
		p1.search_rings();
		Thread.sleep(3000);
		p1.click_Mousover(driver);
		
}
}
