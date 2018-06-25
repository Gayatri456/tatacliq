package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basetest;

//import Genericlib.Basetest;
//import Genericlib.Constant;

public class Loginpage extends Basetest
{
	@FindBy(xpath="//a[contains(@id,'in')]")
	private WebElement signbtn;
	
	@FindBy(id="j_username_login")
	private WebElement usertb;
	
	@FindBy(id="j_password_login")
	private WebElement pwdtb;
	
	@FindBy(id="accountLoginButton")
	private WebElement loginbtn;
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signbutton()
	{
		signbtn.click();
	}
	
	public void username(String us)
	{
		usertb.sendKeys(us);
	}
	
	public void password(String pwd)
	{
		pwdtb.sendKeys(pwd);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	
}
