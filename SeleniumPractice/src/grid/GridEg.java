package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg {

	@Parameters({"browser", "plotform"})
	@Test
	public void grid(String br, String pt) throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = null;
		
		if(br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("windows")){
			cap = DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("windows")) {
			cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.8:4444/wd/hub"), cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(15000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}