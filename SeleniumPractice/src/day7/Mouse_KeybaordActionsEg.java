package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeybaordActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(ele).perform();
//		Thread.sleep(5000);
//		act.contextClick().perform();
		
		act.moveToElement(ele).contextClick().build().perform();
 	}

}
