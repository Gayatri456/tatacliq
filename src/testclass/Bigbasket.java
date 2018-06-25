package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Bigbsktpg;



public class Bigbasket extends Basetest implements Constant  {

	@Test
	public void big()  {
		
		Bigbsktpg bg=new Bigbsktpg(driver);
		bg.signin();
		bg.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		bg.password(Excel.Excelsheet(path, "sheet1", 3, 2));
		bg.submit();
	}

}
