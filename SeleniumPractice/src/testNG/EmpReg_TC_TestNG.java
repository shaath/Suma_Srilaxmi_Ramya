package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TC_TestNG extends TestNGMaster {
	
	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String eid) throws InterruptedException{
		expval = f+" "+l;
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] d = new Object[4][3];
		
		d[0][0] = "Ram";
		d[0][1] = "S";
		d[0][2] = "RS74095";
		
		d[1][0] = "Venkat";
		d[1][1] = "A";
		d[1][2] = "VA745094";
		
		d[2][0] = "Shiva";
		d[2][1] = "P";
		d[2][2] = "SP745994";
		
		d[3][0] = "Narayan";
		d[3][1] = "L";
		d[3][2] = "NL7845994";
		
		return d;
		
 	}

}
