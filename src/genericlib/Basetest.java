package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant {

	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new FirefoxDriver();
		driver.get(Excel.Excelsheet(path, "Sheet1", 1, 0));
}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}