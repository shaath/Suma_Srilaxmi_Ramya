package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input"));
		System.out.println(radios.size());
		
		for(int i = 0; i < radios.size(); i++){
			String name = radios.get(i).getAttribute("value");
			System.out.println(name);
			
			if(name.equalsIgnoreCase("Cheese") || name.equalsIgnoreCase("Beer")){
				radios.get(i).click();
			}
		}

	}

}
