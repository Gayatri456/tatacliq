package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Zomatopage;

public class Zomato extends Basetest implements Constant {

	@Test
	public void zomato() throws InterruptedException {
		Zomatopage z=new Zomatopage(driver);
		z.signin();
		Thread.sleep(6000);
		z.login();
		z.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		z.password(Excel.Excelsheet(path, "sheet1", 12, 2));
		z.submit();
	}
}
