package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		WebElement ele = driver.findElement(By.id("Table_011"));
		List<WebElement> links = ele.findElements(By.tagName("a"));
		
		for(int i = 0 ; i < links.size(); i++){
			String lText = links.get(i).getText();
			System.out.println(lText);	
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\BarghavaRecordings\\Workspace1\\SeleniumPractice\\src\\screenshots\\"+lText+".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			ele = driver.findElement(By.id("Table_011"));
			links = ele.findElements(By.tagName("a"));
		}
	}

}
