package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMLogin_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\BarghavaRecordings\\Jars\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\BarghavaRecordings\\Jars\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(15000);
		WebElement username = driver.findElement(By.name("username"));
		
//		username.click();
		username.sendKeys("Admin");
		Thread.sleep(5000);
//		username.click();
//		Thread.sleep(5000);
//		username.click();
//		username.clear();
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		driver.findElement(By.linkText("Logout")).click();
		
//		driver.close();
		driver.quit();
	}

}
