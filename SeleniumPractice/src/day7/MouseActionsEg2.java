package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://demo.automationtesting.in/Selectable.html");
		
		WebElement ele = driver.findElement(By.xpath("(//*[contains(text(), 'Method Chaining')])[1]"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(ele).perform();
		act.click(ele).perform();

	}

}
