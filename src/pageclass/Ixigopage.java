package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ixigopage {

	@FindBy(xpath="//span[@class='user-login ixi-icon-user']")
	private WebElement sign;
	
	@FindBy(name="email")
	private WebElement untb;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="(//button[@class='c-btn u-link enabled'])[2]")
	private WebElement sbt;
	
	public Ixigopage(WebDriver driver)
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
