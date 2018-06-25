package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Ixigopage;

public class Ixigo extends Basetest implements Constant {

	@Test
	public void ixigo() throws InterruptedException {
		Ixigopage i=new Ixigopage(driver);
		i.signin();
		Thread.sleep(4000);
		i.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		i.password(Excel.Excelsheet(path, "sheet1", 8, 2));
		i.submit();
	}

}
