package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shinepage {

	@FindBy(xpath="//div[@class='up']")
	private WebElement sign;
	
	@FindBy(id="id_email_login")
	private WebElement untb;
	
	@FindBy(id="id_password")
	private WebElement pwd;
	
	@FindBy(name="login_popup")
	private WebElement sbt;
	
	public shinepage(WebDriver driver)
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
