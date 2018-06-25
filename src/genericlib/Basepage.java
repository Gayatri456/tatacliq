package genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage extends Basetest {

	public void Elementpresent(WebElement Element)
	{
		try {
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOf(Element));
			Reporter.log("Pass");
		}
	catch(Exception e)
		{
		Reporter.log("Fail");
		Assert.fail();
		}
	}
	
	public void Verifytitle(String S)
	{
		try {
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.titleContains(S));
			Reporter.log("Pass");
		}
	catch(Exception e)
		{
		Reporter.log("Fail");
		Assert.fail();
		}
	}
}
