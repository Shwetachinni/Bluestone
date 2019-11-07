package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.pom_scenario11;

public class test_scenario11 extends Open_closeAppln{
@Test
public void test_offers() throws InterruptedException
{
	pom_scenario11 p1=new pom_scenario11(driver);
	p1.click_Mousover(driver);
}
}
