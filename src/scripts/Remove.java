package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pom.Cartpage;
import pom.Homepage;
import pom.Loginpage;

public class Remove extends Basetest implements Constant{

	@Test
	public void remove() throws InterruptedException
	{
	Loginpage l=new Loginpage(driver);
	Thread.sleep(3000);
	l.signbutton();
	l.username(Excel.Excelsheet(path, "Sheet1", 1, 1));
	l.password(Excel.Excelsheet(path, "Sheet1", 1, 2));
	Thread.sleep(3000);
	l.login();
	
	Homepage h=new Homepage(driver);
	Thread.sleep(6000);
	h.Mybag();
	
	Cartpage cart=new Cartpage( driver);
	cart.pincode("576107`");
	Thread.sleep(5000);
	cart.check();
	Thread.sleep(5000);
	cart.remove();
	
	Actions a=new Actions(driver);
	h.logout(a);
}
}