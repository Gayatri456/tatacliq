package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

public class Homepage extends Basetest {

	@FindBy(xpath="//span[@class='material-icons']")
	private WebElement Hi;
	
	@FindBy(xpath="//a[.=' Sign Out']")
	private WebElement lgut;
	
	@FindBy(xpath="(//span[.='Department'])[2]")
	private WebElement dept;
	
	@FindBy(xpath="(//a[.='Women'])[2]")
	private WebElement wmn;
	
	@FindBy(id="js-site-search-input")
	private WebElement search;
	
	@FindBy(id="searchButton")
	private WebElement btn;
	
	@FindBy(xpath="(//a[.='Men'])[2]")
	private WebElement mn;
	
	@FindBy(xpath="(//a[.='T-shirts & Polos'])[2]")
	private WebElement shrt;
	
	@FindBy(xpath="//a[@style='position: static;']")
	private WebElement bag;
	
	@FindBy(xpath="//span[.='Brand']")
	private WebElement brnd;
	
	@FindBy(id="Watches&Accessories")
	private WebElement wths;
	
	@FindBy(id="tab-1")
	private WebElement mrkt;

	@FindBy(xpath="//img[@alt='Icons_ElectronicsSale.png']")
	private WebElement elmt;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logout(Actions a) throws InterruptedException
	{
		Thread.sleep(9000);
		a.moveToElement(Hi).perform();
		Thread.sleep(5000);
		lgut.click();
	}

	public void department(Actions b) throws InterruptedException
	{
		b.moveToElement(dept).perform();
		Thread.sleep(5000);
		wmn.click();
	}
	
	public void Search(String sr) {
		search.sendKeys(sr);
	}
	
	public void button()
	{
		btn.click();
	}
	
	public void department2(Actions c) throws InterruptedException
	{
		c.moveToElement(dept).perform();
		Thread.sleep(6000);
		c.moveToElement(mn).perform();
		Thread.sleep(5000);
		shrt.click();
	}
	
	public void Mybag() throws InterruptedException
	{
		Thread.sleep(5000);
		bag.click();	
	}	
	
	public void market() throws InterruptedException
	{
		Thread.sleep(8000);
		mrkt.click();
		Thread.sleep(5000);
		elmt.click();
	}
	
}