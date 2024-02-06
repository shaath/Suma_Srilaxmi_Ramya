package functionDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMMethods extends Genericmethods {

	public FileInputStream fi;
	public Properties pr;
	public String url = "http://orangehrm.qedgetech.com";
	public String expval, actval;
	//Launch
	public String orgLaunch(String br, String url) throws IOException{
		expval = "LOGIN";
		brlaunch(br, url);
		
		fi = new FileInputStream("D:\\BarghavaRecordings\\Workspace1\\SeleniumPractice\\src\\properties\\orgHRM.properties");
		pr = new Properties();
		pr.load(fi);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String orgLogin(String u,String p){
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}

	//Logout
	public String orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void orgClose(){
		driver.quit();
	}
	
	//Employee Registration
	public String orgEmpReg(String f, String l, String eid) throws InterruptedException{
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
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//User Registration
	public String orguserReg(String ename, String uname, String pwd) throws InterruptedException{
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
		
		if (flag) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
}
