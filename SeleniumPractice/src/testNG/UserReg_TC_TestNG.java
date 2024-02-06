package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserReg_TC_TestNG extends TestNGMaster{

	@Test
	public void orgEmpReg() throws InterruptedException{
		boolean flag = false;
		expval = uname;
		Thread.sleep(5000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
		
		for(int i = 0; i < cols.size(); i++){
			actval  = cols.get(i).getText();
			if(expval.equalsIgnoreCase(actval)){
				flag = true;
				break;
			}
		}
		
		Assert.assertEquals(true, flag);
	}
}
