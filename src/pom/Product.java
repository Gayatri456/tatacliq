 package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Product extends Basetest {
	
	@FindBy(xpath="//a[@class='mini-cart-link myBag-sticky']")
	private WebElement mybag;
	
	
	
	@FindBy(xpath="//a[.='Track Order']")
	private WebElement trk;
	
	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void Add(Actions a) throws InterruptedException
	{
		mybag.click();
	}
	
	
	
	
	
	public void Track()
	{
		trk.click();
	}
}
