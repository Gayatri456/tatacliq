
package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Ebaypage;

public class Ebay extends Basetest implements Constant{

	@Test
	public void ebay() throws InterruptedException {
		Ebaypage e=new Ebaypage(driver);
		e.signin();
		e.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		e.password(Excel.Excelsheet(path, "sheet1", 6, 2));
		Thread.sleep(2000);
		e.submit();
	}

}
