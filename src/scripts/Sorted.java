package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Productlistpage;

public class Sorted extends Basetest {

	@Test
	public void sort() throws InterruptedException
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
		
		Homepage h = new Homepage(driver);
		Thread.sleep(6000);
		Actions c=new Actions(driver);
		h.department2(c);
		
		Productlistpage pl=new Productlistpage(driver);
		pl.lowprice();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,-800)");
		
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		Actions a=new Actions(driver);
		h.logout(a);
}
}
