package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class crftlgnpg {

	@FindBy(xpath="//span[@class='hidden-xs user-name']")
	private WebElement sgn;
	
	@FindBy(id="emailId")
	private WebElement ustb;
	
	@FindBy(id="continueBtn")
	private WebElement ctnbn;
	
	@FindBy(id="userPassword")
	private WebElement pwd;
	
	@FindBy(id="loginCheck")
	private WebElement sbt;
	
	public crftlgnpg(WebDriver driver)
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
}
