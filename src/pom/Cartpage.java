package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Cartpage extends Basetest {
	
	@FindBy(id="defaultPinCodeIds")
	private WebElement pn;
	
	@FindBy(id="pinCodeButtonIds")
	private WebElement chk;
	
	@FindBy(xpath="(//a[@data-placement='bottom'])[1]")
	private WebElement wsh;
	
	@FindBy(xpath="//span[.='Remove']")
	private WebElement rmv;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void pincode(String s)
	{
		pn.sendKeys(s);
	}
	
	public void check()
	{
		chk.click();
	}

	public void wish()
	{
		wsh.click();
	}
	public void remove()
	{
		rmv.click();
	}
}


