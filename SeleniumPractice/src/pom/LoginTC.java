package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC {

	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\BarghavaRecordings\\Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
				
		driver.get(lp.url);
		
		lp.orgLogin("Admin", "Qedge123!@#");
		Thread.sleep(5000);
		
		AdminPage ap = PageFactory.initElements(driver, AdminPage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}
}