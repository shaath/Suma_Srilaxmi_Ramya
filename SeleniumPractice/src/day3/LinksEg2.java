package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
//		driver.findElement(By.linkText("Home")).click();
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		driver.findElement(By.id("Table_011")).findElement(By.linkText("Home")).click();
		
		WebElement ele = driver.findElement(By.id("Table_011"));
		List<WebElement> links = ele.findElements(By.tagName("a"));
		
		for(int i = 0 ; i < links.size(); i++){
			String lText = links.get(i).getText();
			System.out.println(lText);
			if(lText.equalsIgnoreCase("NRI Banking")){
				links.get(i).click();
				break;
			}
		}
		

	}

}
