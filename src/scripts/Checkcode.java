package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pom.Cartpage;
import pom.Homepage;
import pom.Loginpage;


	@Test
	public class Checkcode extends Basetest implements Constant
	{
		
		@Test
		public void checkcode() throws InterruptedException
		{
		Loginpage l=new Loginpage(driver);
		Thread.sleep(5000);
		l.signbutton();
		l.username(Excel.Excelsheet(path, "Sheet1", 1, 1));
		l.password(Excel.Excelsheet(path, "Sheet1", 1, 2));
		Thread.sleep(3000);
		l.login();
		
		Homepage h=new Homepage(driver);
		Thread.sleep(6000);
		h.Mybag();
		
		Cartpage cart=new Cartpage(driver);
		Thread.sleep(6000);
		cart.pincode(Excel.Excelsheet(path, "Sheet1", 1, 3));
		Thread.sleep(6000);
		cart.check();
		
		Actions a=new Actions(driver);
		h.logout(a);
}
}