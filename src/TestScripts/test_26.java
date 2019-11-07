package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_26;

public class test_26 extends Open_closeAppln {
	@Test
	public void scroll() throws InterruptedException
	{
		pom_26 p1=new pom_26(driver);
		Thread.sleep(3000);
		p1.scroll_bar(driver);
}
}
