package com.phpTravels.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static Properties properties;
	
	public BaseClass() {

		properties = new Properties();
		try {
			FileInputStream fileIP = new FileInputStream("F:/Office/Work/Eclipse Workspace/phpTravels/src/main/java/com/phpTravels/config/config.properties");
			properties.load(fileIP);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialize() {
		String browser = properties.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("url"));
	
	}
	
}
