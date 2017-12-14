package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingChrome {
	public static void main(String[] args) {
		// Set the property
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")  + "/lib/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  + "/lib/chromedriver.exe");
		
		// Now we use Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println("URL: " + driver.getCurrentUrl());
		driver.close();
	}
}
