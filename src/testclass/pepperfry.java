package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Pprlgnpg;

public class pepperfry extends Basetest implements Constant{

	@Test
	public void pepper() throws InterruptedException  {
		
		Pprlgnpg pr=new Pprlgnpg(driver);
		pr.login();
		pr.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		Thread.sleep(2000);
		pr.password(Excel.Excelsheet(path, "sheet1", 10, 2));
		pr.submit();
}
}
