package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_26 {
	@FindBy(xpath="(//img[@class='img-responsive-c lazy-img'])[9]")
	private WebElement scroll_ele;
	
	
	public pom_26(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void scroll_bar(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Point loc=scroll_ele.getLocation();
		int x=loc.getX();
		System.out.println(x);
		int y=loc.getY();
		System.out.println(y);
		Thread.sleep(6000);
		js.executeScript("window.scroll("+x+", "+y+")");
		Thread.sleep(3000);
		scroll_ele.click();
	}
		
		
}
