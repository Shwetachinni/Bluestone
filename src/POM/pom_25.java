package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_25 {
	@FindBy(xpath="//input[@name='search_query']")
	private WebElement search1;
	@FindBy(xpath="//input[@name='submit_search']")
	private WebElement s_rng;
	
	@FindBy(xpath="(//div[@class='top-filter-blocks'])[4]")
	private WebElement metal;
	 @FindBy(xpath="(//span[@class='prcs-dlh'])[14]")
		private WebElement pric_below;
	
	 @FindBy(xpath="//ul[@id='product_list_ui']/li")
		private List<WebElement> cnt;
	public pom_25(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search_rings() throws InterruptedException
	{
		search1.sendKeys("rings");
		Thread.sleep(3000);
		s_rng.click();
	}
	
	public void click_Mousover(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(metal).perform();
		pric_below.click();
		Thread.sleep(3000);
		int c = cnt.size();
		System.out.println("number of platinum ring:"+c);
	
}
}
