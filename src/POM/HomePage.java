package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="(//a[contains(.,'Rings')])[1]")
	private WebElement rng;
	
	@FindBy(xpath="(//a[.='Diamond'])[1]")
	private WebElement diamndrng;

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Mouseover(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(rng).perform();
		Thread.sleep(3000);
		diamndrng.click();
	}
	
}
