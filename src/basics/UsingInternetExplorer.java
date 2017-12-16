package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UsingInternetExplorer {
	public static void main(String[] args) {
System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")  + "/lib/IEDriverServer.exe");
		
		// Now we use Internet Explorer driver
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println("URL: " + driver.getCurrentUrl());
		driver.close();
	}

}
