package testclass;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Constant;
import genericlib.Excel;
import pageclass.Freshrlgnpg;

public class Fresherworld extends Basetest implements Constant {

		@Test
		public void fresher()  {
		
		Freshrlgnpg fr=new Freshrlgnpg(driver);
		fr.signin();
		fr.username(Excel.Excelsheet(path, "sheet1", 1, 1));
		fr.password(Excel.Excelsheet(path, "sheet1", 7, 2));
		fr.submit();

}
}
