package day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://gmail.com");
		
		String gmailWID = driver.getWindowHandle();
//		System.out.println(gmailWID);
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String wid: s){
			System.out.println(wid);
			
			driver.switchTo().window(wid);
			Thread.sleep(5000);
			String title = driver.getTitle();
			
			if (title.contains("Privacy")) {
				driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]")).click();
				System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
				break;
			}
			
		}
		
//		driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]")).click();

	}

}
