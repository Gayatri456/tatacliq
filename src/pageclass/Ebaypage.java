package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Ebaypage {
	@FindBy(xpath="//a[.='Sign in']")
	private WebElement sign;
	
	@FindBy(id="userid")
	private WebElement untb;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(id="sgnBt")
	private WebElement sbt;
	
	public Ebaypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signin() {
		sign.click();
	}
	
	public void username(String un) {
		untb.sendKeys(un);
	}
	
	public void password(String pw) {
		pwd.sendKeys(pw);
	}
	
	public void submit() {
		sbt.click();
	}
}
