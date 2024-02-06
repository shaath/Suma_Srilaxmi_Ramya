package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> checks = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input"));
		System.out.println(checks.size());
		
		for(int i = 0; i < checks.size(); i++){
			System.out.println(checks.get(i).getAttribute("name"));
//			if(!checks.get(i).isSelected()){
//				checks.get(i).click();
//			}
		}

	}

}
