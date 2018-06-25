package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Amznlgnpg;

public class Amazon extends Basetest implements Constant {
	
	@Test
	public void amazon() throws InterruptedException{
		
		Amznlgnpg an =new Amznlgnpg(driver);
		an.signin();
		an.username(Excel.Excelsheet(path, "Sheet1", 1, 1));
		an.continu();
		an.password(Excel.Excelsheet(path, "Sheet1", 2, 2));
		an.submit();
		
	}
}

