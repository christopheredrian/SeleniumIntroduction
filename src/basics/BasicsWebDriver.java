package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicsWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")  + "/lib/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  + "/lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println("URL: " + driver.getCurrentUrl());
		driver.close();
	}
}
