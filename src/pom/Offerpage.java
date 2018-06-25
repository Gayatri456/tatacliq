package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Offerpage extends Basetest {
	
	@FindBy(xpath="(//img[@class='image call-to-action-banner'])[3]")
	private WebElement krts;
	
//	@FindBy(xpath="(//img[@class='image call-to-action-banner'])[2]")
//	private WebElement jns;
	
	public Offerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void kurtis() 
	{
		krts.click();
	}
	
//	public void jeans() {
//		jns.click();
//	}

}
