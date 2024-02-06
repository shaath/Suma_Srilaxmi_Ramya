package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginEg2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.findElement(By.id("username")).sendKeys("testingtoolstrainer449@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@74185296");
		driver.findElement(By.name("login")).click();

	}

}
