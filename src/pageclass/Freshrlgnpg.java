package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Freshrlgnpg  {

	@FindBy(xpath="//span[.='Login']")
	private WebElement sgn;
	
	@FindBy(id="emailpop")
	private WebElement ustb;
	
	@FindBy(id="passwordpop")
	private WebElement pwd;
	
	@FindBy(id="loginSubmitpop")
	private WebElement sbt;
	
public Freshrlgnpg (WebDriver driver)
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
