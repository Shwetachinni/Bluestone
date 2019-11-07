package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Jewel {
	
	@FindBy(xpath="//a[@title='Jewellery']")
	private WebElement allJewel;
	
    @FindBy(xpath="//a[@title='Kadas']")
    private WebElement kada;
    @FindBy(xpath="(//ul)[3]/li[5]")
    private WebElement kada5;
    @FindBy(xpath="//div[@class='buynow-block col-xs-7']")
    private WebElement buynow;
	
	public Home_Jewel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Mousover(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(allJewel).perform();
		
	}
	public void click_kada(WebDriver driver)
	{
		kada.click();
	}
	public void kada_5(WebDriver driver)
	{
		kada5.click();
	}
	public void buy_now(WebDriver driver)
	{
		buynow.click();
	}

}

