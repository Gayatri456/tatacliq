package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pom.Addtocartpage;
import pom.Homepage;
import pom.Loginpage;
import pom.Offerpage;
import pom.Productlistpage;


public class Addtobag extends Basetest implements Constant
{

		@Test
		public void addtocart() throws InterruptedException
		{
		Loginpage l=new Loginpage(driver);
		Thread.sleep(3000);
		l.signbutton();
		l.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		l.password(Excel.Excelsheet(path, "sheet1", 1, 2));
		Thread.sleep(3000);
		l.login();
		
		Homepage h=new Homepage(driver);
		Thread.sleep(6000);
		Actions b=new Actions(driver);
		h.department(b);
		Thread.sleep(5000);

		
	    Offerpage o=new Offerpage(driver);
	    o.kurtis();
	    
	    Productlistpage p1=new Productlistpage(driver);
	    Thread.sleep(6000);
	    p1.select();
	    
	    Addtocartpage atc=new Addtocartpage(driver);
	    Thread.sleep(5000);
	    atc.size();
	    Thread.sleep(8000);
	    atc.addtocrt();
	    Thread.sleep(5000);
	    
	    Actions a=new Actions(driver);
		Thread.sleep(6000);
		h.logout(a);
		
	}

}
