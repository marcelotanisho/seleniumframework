package br.com.marcelotanisho.DriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
	public static WebDriver selectDriver(DriverEnum driverName) {
		
		switch(driverName) {
			case CHROME: System.setProperty("webdriver.chrome.driver", "/Users/marcelotanisho/Work/chromedriver");
				return new ChromeDriver();
			case FIREFOX: System.setProperty("webdriver.gecko.driver", "driverLocation");
				return new FirefoxDriver();
			case IE: System.setProperty("webdriver.ie.driver", "driverLocation");
				return new InternetExplorerDriver();
			case SAFARI: System.setProperty("webdriver.safari.driver", "driverLocation");
				return new SafariDriver();
			default: return null;
		}

	}
}
