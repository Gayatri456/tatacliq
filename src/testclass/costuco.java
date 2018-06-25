package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Coctucopage;

public class costuco extends Basetest implements Constant{
	@Test
	public void amazon() throws InterruptedException{
		
		Coctucopage l=new Coctucopage(driver);
		l.close();
		Thread.sleep(3000);
		l.signin();
		l.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		l.password(Excel.Excelsheet(path, "sheet1", 4, 2));
		Thread.sleep(2000);
		l.submit();
		
	}
}
