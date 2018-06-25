package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Productlistpage;

public class Scroll extends Basetest {

	@Test
	public void scroll() throws InterruptedException
	{
	
	Thread.sleep(1000);
	Loginpage l=new Loginpage(driver);
	Thread.sleep(5000);
	l.signbutton();
	l.username(Excel.Excelsheet(path, "sheet1", 1, 1));
	l.password(Excel.Excelsheet(path, "sheet1", 1, 2));
	Thread.sleep(2000);
	l.login();
	Thread.sleep(1000);
	
	Homepage h=new Homepage(driver);
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,500)");
	
	Productlistpage pl = new Productlistpage(driver);
	pl.Prod();
	
	Actions a=new Actions(driver);
	h.logout(a);
}
}