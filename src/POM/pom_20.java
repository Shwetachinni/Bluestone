package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_20 {
	@FindBy(xpath="//a[@title='Coins']")
	private WebElement lakcoins;
	@FindBy(xpath="(//span[.='10 gram'])[1]")
	private WebElement onegm;
	
	@FindBy(xpath="//h1[.='10 gram 24 KT Lakshmi Gold Coin']")
	private WebElement goldname;
	public pom_20(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Mousover(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(lakcoins).perform();
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
