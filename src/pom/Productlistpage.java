package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Productlistpage extends Basetest{
	
	@FindBy(xpath="(//img[@style='display: inline;'])[2]")
	private WebElement pdt;
	
	@FindBy(xpath="(//div[@class='home-best-pick-carousel-img'])[6]")
	private WebElement pro;
	
	@FindBy(xpath="(//img[@class='picZoomer-pic lazy'])[2]")
	private WebElement shoe;
	
	@FindBy(xpath="(//span[.='Low'])[1]")
	private WebElement lw;
	
	
	public Productlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void select() {
		pdt.click();
	}
	
	public void Prod() throws InterruptedException
	{
		Thread.sleep(6000);
		pro.click();
		Thread.sleep(8000);
		shoe.click();
	}
	
	public void lowprice() throws InterruptedException
	{
		Thread.sleep(6000);
		lw.click();
	}
	

}
