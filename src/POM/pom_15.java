package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_15 {
	@FindBy(xpath="//a[@title='Coins']")
	private WebElement coins;
	@FindBy(xpath="(//span[.='2 gram'])[1]")
	private WebElement onegm;
	
	@FindBy(xpath="//h1[.='2 gram 24 KT Gold Coin']")
	private WebElement goldname;
	public pom_15(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Mousover(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
		Thread.sleep(2000);
	
		
	}
	public void one_click()
	{
		onegm.click();
	}
	public void getname()
	{
		String nam = goldname.getText();
		System.out.println(nam);
	}
}
