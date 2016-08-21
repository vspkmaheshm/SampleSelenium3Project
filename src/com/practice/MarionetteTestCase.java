package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.condition.Condition;

public class MarionetteTestCase {

	public static void main(String[] args) {
		
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		capabilities.setCapability("binary", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		System.setProperty("webdriver.gecko.driver", "H:\\libs\\gecko v10\\wires.exe");
		final FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("xpinstall.signatures.required", false);
		WebDriver driver = new MarionetteDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8085/login.do");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track123"));
//		ExpectedConditions.and(ExpectedConditions.titleContains("").apply(driver));
		System.out.println(driver.getTitle());
		System.out.println("tested");
		driver.close();
		driver.quit();
		
	}

}
