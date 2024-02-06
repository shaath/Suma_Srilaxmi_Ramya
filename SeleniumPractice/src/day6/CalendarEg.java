package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEg {

	public static void main(String[] args) throws InterruptedException {
		String d = "15/August/2024";
		String[] split = d.split("/");
		String expMY = split[1]+" "+split[2];
		String expDay = split[0];
		System.out.println(expMY+"----------------"+expDay);
		
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='d-flex']//*[local-name()='path' and @stroke-linecap='round']")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='g' and contains(@mask, 'url')]/*[local-name()='path']/../.."));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].click();", ele);
//		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		je.executeScript("window.scrollBy(0, 250)", ele);
		Thread.sleep(5000);
		ele.click();
		
		String actMY = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(actMY);
		
		while(!expMY.equalsIgnoreCase(actMY)){
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			actMY = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']/div")).getText();
		}
		
		List<WebElement> calDays = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]/div/div/../.."));
		for(int i = 0; i < calDays.size(); i++){
			String actDay = calDays.get(i).getAttribute("aria-label");
			System.out.println(" "+actDay+" ");
			if (actDay.contains(expDay)) {
				calDays.get(i).click();
				break;
			}
		}
	}

}
