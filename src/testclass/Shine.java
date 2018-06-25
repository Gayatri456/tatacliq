package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.shinepage;

public class Shine extends Basetest implements Constant {

	@Test
	public void shine() {
		shinepage s=new shinepage(driver);
		s.signin();
		s.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		s.password(Excel.Excelsheet(path, "sheet1", 11, 2));
		s.submit();
	}

}
