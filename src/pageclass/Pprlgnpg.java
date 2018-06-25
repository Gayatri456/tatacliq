package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pprlgnpg  {
	@FindBy(xpath="//b[.='Login']")
	private WebElement lgn;
	
	@FindBy(name="user[new]")
	private WebElement ustb;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="popup_login_form")
	private WebElement sbt;
	
public Pprlgnpg (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void login() {
	lgn.click();
}
public void username(String us)
{
	ustb.sendKeys(us);
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
