package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.crftlgnpg;

public class Craftvilla extends Basetest implements Constant{

	@Test
	public void craft() throws InterruptedException {
		
		crftlgnpg crt =new crftlgnpg(driver);
		crt.signin();
		crt.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		crt.continu();
		Thread.sleep(3000);
		crt.password(Excel.Excelsheet(path, "sheet1", 5, 2));
		crt.submit();

		
		
	}

}
