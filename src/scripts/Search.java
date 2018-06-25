package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Excel;
import pom.Homepage;
import pom.Loginpage;

public class Search extends Basetest {

	@Test
	public void search() throws InterruptedException{
	
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
		Thread.sleep(2000);
		h.Search(Excel.Excelsheet(path, "Sheet1", 1, 4));
		h.button();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		Actions a=new Actions(driver);
		h.logout(a);
}
}