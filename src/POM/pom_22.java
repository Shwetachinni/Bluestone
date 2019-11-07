package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom_22 {
	@FindBy(xpath="//input[@name='search_query']")
	private WebElement search1;
	@FindBy(xpath="//input[@name='submit_search']")
	private WebElement s_rng;
	
	@FindBy(xpath="(//div[@class='top-filter-blocks'])[6]")
	private WebElement pric;
	 @FindBy(xpath="(//span[@class='prcs-dlh'])[18]")
		private WebElement pric_below;
	
	 @FindBy(xpath="//ul[@id='product_list_ui']/li")
		private List<WebElement> cnt;
	public pom_22(WebDriver driver)
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
		act.moveToElement(pric).perform();
		pric_below.click();
		Thread.sleep(3000);
		int c = cnt.size();
		System.out.println("number of ring:"+c);
	
		
	}
	
}
