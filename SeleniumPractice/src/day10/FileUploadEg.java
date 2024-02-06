package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(5000);
		WebElement input = driver.findElement(By.id("photofile"));
		
//		input.sendKeys("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");
		
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].click();", input);
		
		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUploadEg.exe");
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUploadEg2.exe");
		
//Create instance of Robot class
   Robot robot = new Robot();

//Create instance of Clipboard class
   Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

//Set the String to Enter
  StringSelection stringSelection = new StringSelection("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");

//Copy the String to Clipboard
  clipboard.setContents(stringSelection, null);

//Use Robot class instance to simulate CTRL+C and CTRL+V key events :
  robot.keyPress(KeyEvent.VK_CONTROL);
  robot.keyPress(KeyEvent.VK_V);
  robot.keyRelease(KeyEvent.VK_V);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  
  Thread.sleep(5000);
  
  robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
