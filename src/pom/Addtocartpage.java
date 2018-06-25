package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

	public class Addtocartpage extends Basetest {
		
		@FindBy(xpath="//a[.='M']")
		private WebElement sz;
		
		@FindBy(id="buyNowButton")
		private WebElement Adtcrt;
		
		
		public Addtocartpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void size()
		{
			sz.click();
		}
		
		public void addtocrt() throws InterruptedException {
			Thread.sleep(10000);
			Adtcrt.click();
		}
	}
