package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coctucopage
{

	@FindBy(xpath="//button[@class='close']")
	private WebElement cls;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement sign;
	
	@FindBy(id="txtStuEmail")
	private WebElement untb;
	
	@FindBy(id="txtStuPassword")
	private WebElement pwd;
	
	@FindBy(id="btnStudentLogin")
	private WebElement sbt;
	
	public Coctucopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void close() {
		cls.click();
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
