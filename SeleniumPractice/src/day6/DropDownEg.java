package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://echoecho.com/htmlforms11.htm");
		
		WebElement drop = driver.findElement(By.name("mydropdown"));
		Thread.sleep(25000);
		Select s = new Select(drop);
//		s.selectByIndex(1);
//		s.selectByValue("Bread");
//		s.selectByVisibleText("Old Cheese");
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
		for(int i = 0; i < options.size(); i++){
			s.selectByIndex(i);
			String name = options.get(i).getText();
			System.out.println(name);
			Thread.sleep(5000);
		}

	}

}
