package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Brandlistpage extends Basetest {

	@FindBy(xpath="(//a[.='Anne Klein'])[1]")
	private WebElement pdt;
	
	@FindBy(xpath="(//img[@class='picZoomer-pic lazy'])[1]")
	private WebElement pdt1;
	
	@FindBy(xpath="(//span[@class='plp-wishlist'])[1]")
	private WebElement wsh1;
	
	public 	Brandlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void watches()
	{
		pdt.click();	
	}
	
	public void product1()
	{
		pdt1.click();
	}
	
	public void wish1()
	{
		pdt1.click();
	}
}

