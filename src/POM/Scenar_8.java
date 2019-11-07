package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.Generic_screenshot;

public class Scenar_8 {
	 
		
		@FindBy(xpath="//a[@title='Jewellery']")
		private WebElement allJewel;
		
	    @FindBy(xpath="//a[@title='Kadas']")
	    private WebElement kada;
	    @FindBy(xpath="(//ul)[3]/li[5]")
	    private WebElement kada5;
	    @FindBy(xpath="//span[@class='select-size']")
	    private WebElement size;
	    @FindBy(xpath="(//span[@class='size'])[2]")
	    private WebElement select_size;
	    
	    @FindBy(xpath="//div[@class='buynow-block col-xs-7']")
	    private WebElement buynow;
	  
	    @FindBy(xpath=" //span[@class='size-box-overlay']")
	    private WebElement verif;
	    
		
		public Scenar_8(WebDriver driver)
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
		public void click_size(WebDriver driver)
		{
			size.click();
		}
		String siz;
		public void select_size(WebDriver driver)
		{
		 siz = select_size.getText();
		 Reporter.log(siz, true);
			select_size.click();
			
//			
		}
		
		public void buy_now(WebDriver driver) throws IOException, InterruptedException
		{
			buynow.click();
			Thread.sleep(3000);
			Generic_screenshot.get_Photo(driver);
			Thread.sleep(3000);
			String siz2 = verif.getText();
			Reporter.log(siz2, true);
      		Assert.assertEquals(siz,siz2);
      		 Reporter.log("both are equal", true);
			
		}
		
			
		
		}
		

