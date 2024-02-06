package day1;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\BarghavaRecordings\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://gmail.com");
	}

}
