package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		
		email.click();
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.chord("Test")).perform();
		Thread.sleep(5000);
		act.doubleClick(email).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("c")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("v")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
	}

}
