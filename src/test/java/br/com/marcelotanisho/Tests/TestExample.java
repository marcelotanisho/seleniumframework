package br.com.marcelotanisho.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.marcelotanisho.DriverUtils.DriverEnum;
import br.com.marcelotanisho.DriverUtils.DriverManager;

public class TestExample {

	WebDriver driver;
	
	@Before
	public void connectDriver() {
		driver = DriverManager.selectDriver(DriverEnum.CHROME);
	}
	
	@Test
	public void accessSite() {
		driver.get("http://www.marcelotanisho.com.br");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void killDriver() {
		driver.quit();
	}

}
