package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_ExplicitWait_Eg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		driver.get("https://demo.automationtesting.in/ProgressBar.html");
		
		driver.findElement(By.id("cricle-btn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100']")));
		System.out.println(driver.findElement(By.xpath("//div[text()='100']")).isDisplayed());

	}

}
