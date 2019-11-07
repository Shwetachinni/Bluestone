package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_22;

public class test_22 extends Open_closeAppln{
	@Test
	public void select_coins() throws InterruptedException
	{
		pom_22 p1=new pom_22(driver);
		p1.search_rings();
		Thread.sleep(3000);
		p1.click_Mousover(driver);
		
}
}
