package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Mkmytrplgnpg {

	@FindBy(xpath="//span[.='log-in']")
	private WebElement sgn;
	
	@FindBy(id="ch_login_email")
	private WebElement ustb;
	
	@FindBy(id="ch_login_password")
	private WebElement pwd;
	
	@FindBy(id="ch_login_btn")
	private WebElement sbt;
	
public Mkmytrplgnpg (WebDriver driver)
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


public void password(String pd)
{
	pwd.sendKeys(pd);
}

public void submit()
{
	sbt.click();
}

}
