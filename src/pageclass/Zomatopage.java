package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zomatopage {

	@FindBy(id="signin-link")
	private WebElement sign;
	
	@FindBy(xpath="//span[.='Log in']")
	private WebElement logn;
	
	@FindBy(id="ld-email")
	private WebElement untb;
	
	@FindBy(id="ld-password")
	private WebElement pwd;
	
	@FindBy(id="ld-submit-global")
	private WebElement sbt;
	
	public Zomatopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signin() {
		sign.click();
	}
		
	public void login() {
		logn.click();
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
