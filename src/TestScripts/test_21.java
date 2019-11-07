package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_21;

public class test_21 extends Open_closeAppln {
	@Test
	public void select_coins() throws InterruptedException
	{
		pom_21 p1=new pom_21(driver);
		p1.search_rings();
		p1.click_Mousover(driver);
		p1.one_click();
}
}
