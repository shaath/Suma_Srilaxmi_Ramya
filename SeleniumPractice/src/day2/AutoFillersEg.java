package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
//		driver.findElement(By.id("src")).sendKeys("hyd");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("hyd");
		Thread.sleep(15000);

		List<WebElement> areaNames = driver.findElements(By.xpath("//div[@role='button']/ul/li"));
		
		System.out.println(areaNames.size());
		for (int i = 0; i < areaNames.size(); i++) 
		{
			String cName = areaNames.get(i).findElement(By.className("placeHolderMainText")).getText();
			System.out.println(cName);
			if(cName.equalsIgnoreCase("Kukatpally")){
				areaNames.get(i).click();
				break;
			}
		}
	}

}
