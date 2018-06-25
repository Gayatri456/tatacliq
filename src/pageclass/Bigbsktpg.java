package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bigbsktpg  {
	
	@FindBy(xpath="(//a[text()='Login'])[3]")
	private WebElement sgn;
	
	@FindBy(id="loginemail")
	private WebElement ustb;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement sbt;
	
public Bigbsktpg (WebDriver driver)
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
