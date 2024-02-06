package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBank_Login_TC_TestNG {
	
	WebDriver driver = null;

	@BeforeMethod
	public void Launch(){
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
	}
	
	@Test
	public void Login(){
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void Logout(){
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	@AfterClass
	public void Close(){
		driver.close();
	}
}
