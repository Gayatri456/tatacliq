package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pom.Homepage;
import pom.Loginpage;

public class Loginlogout extends Basetest implements Constant{
	
	@Test
	public void loginout() throws InterruptedException
	{
	Loginpage l=new Loginpage(driver);
	Thread.sleep(6000);
	l.signbutton();
	l.username(Excel.Excelsheet(path, "sheet1", 1, 1));
	l.password(Excel.Excelsheet(path, "sheet1", 1, 2));
	Thread.sleep(3000);
	l.login();
	
	Homepage h=new Homepage(driver);
	Thread.sleep(6000);
	Actions a=new Actions(driver);
	Thread.sleep(6000);
	h.logout(a);

}
	
}