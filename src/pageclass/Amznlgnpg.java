package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amznlgnpg {

	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement sgn;
	
	@FindBy(id="ap_email")
	private WebElement ustb;
	
	@FindBy(id="continue")
	private WebElement ctnbn;
	
	@FindBy(id="ap_password")
	private WebElement pwd;
	
	@FindBy(id="signInSubmit")
	private WebElement sbt;
	
	@FindBy(xpath="//span[@class='nav-line-1']")
	private WebElement he;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement lgt;
	
	public Amznlgnpg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signin()
	{
		sgn.click();
	}
	
	public void username(String us)
	{
		ustb.sendKeys(us);
	}
	
	public void continu()
	{
		ctnbn.click();
	}
	
	public void password(String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void submit()
	{
		sbt.click();
	}
	
	public void logout(Actions a) throws InterruptedException
	{
		a.moveToElement(he).perform();
		Thread.sleep(5000);
		lgt.click();
	}
}
