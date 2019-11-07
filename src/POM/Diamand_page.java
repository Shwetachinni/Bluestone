package POM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diamand_page {

	@FindBy(xpath="//ul/li//div/span/span/span[1]/span[1]")
	private List<WebElement> dprices;
	
	@FindBy(xpath="//span[.=' Popular ']")
	private WebElement puplr;
	
	@FindBy(xpath="//a[.='Price Low to High ']")
	private WebElement LtoH;
	
	@FindBy(xpath="//ul/li//div/span/span/span[1]/span[1]")
	private List<WebElement> LtoHPrices;
	
	public Diamand_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	ArrayList l1=new ArrayList();
	ArrayList l2=new ArrayList();
	public void Get_DefaultPrice()
	{
		System.out.println("Default Prices");
		System.out.println(dprices.size());
		
		for(WebElement we:dprices)
		{
			String dprce = we.getText();
			System.out.println(dprce);
			l1.add(dprce);
		}
		
		Collections.sort(l1);
		System.out.println(l1);
	}
	
	public void Click_populor(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(puplr).perform();
		
		LtoH.click();
	}
	
	public void Get_LToHPrice()
	{
		System.out.println("Low TO High Prices");
		System.out.println(LtoHPrices.size());
		
		for(WebElement we:LtoHPrices)
		{
			String sortLtoH = we.getText();
			System.out.println(sortLtoH);
			l2.add(sortLtoH);
		}
	}
	
		
	public void Compare_price()
	{
		if(l1==l2)
		{
			
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
	}
}
