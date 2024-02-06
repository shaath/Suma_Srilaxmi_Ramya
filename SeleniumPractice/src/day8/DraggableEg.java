package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(drag, 397, 0).perform();


	}

}
