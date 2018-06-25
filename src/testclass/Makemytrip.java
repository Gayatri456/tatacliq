package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Mkmytrplgnpg;

public class Makemytrip extends Basetest implements Constant{

	@Test
	public void trip()  {
		
		Mkmytrplgnpg mr=new Mkmytrplgnpg(driver);
		mr.signin();
		mr.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		mr.password(Excel.Excelsheet(path, "sheet1", 9, 2));
		mr.submit();
		

}
}
