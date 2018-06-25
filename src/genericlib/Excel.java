package genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class Excel implements Constant{
	
	public static  String Excelsheet(String path,String sheet, int r, int c) {
		String s="";
		try {
			FileInputStream f=new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(f);
			s=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		}
		catch(Exception e)
		{
		Reporter.log("Fail");	
		Assert.fail();
		}
		return s;
	}

}
