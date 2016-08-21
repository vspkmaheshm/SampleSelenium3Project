package com.practice;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.Assert;

public class GhostCodes {
	@Test
	public void ghostmethod() throws InterruptedException{
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatesh.kv\\Downloads\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver(); 
		final FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("xpinstall.signatures.required", false);
		WebDriver driver = new MarionetteDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.ghostcodes.com/");
		driver.findElement(By.xpath("//li[@class='active']")).click();
		String Text = driver.findElement(By.xpath("//h1[text()='Featured Ghosties']")).getText();
		System.out.println(Text);
		Assert.assertEquals("Featured Ghosties", Text.replace("", ""));
		Thread.sleep(2000);
	
		//Clicking on category
		driver.findElement(By.xpath("//a[@href='/category/comedians']")).click();
		String Category = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/h1")).getText();
		System.out.println(Category);
		Assert.assertEquals("Comedians", Category.replace("", ""));
		
		
        Thread.sleep(3000);
        //Clicking on Profile
		driver.findElement(By.xpath("//img[@title='dannyberk-ghostcodes']")).click();
		String profile = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/h1")).getText();
		System.out.println(profile);
		Assert.assertEquals("Danny Berk's Profile", profile.replace("", ""));
		
		//Clicking on kudos
		driver.findElement(By.xpath("//img[@class='icon-sprite icon-sm-likes loading']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='likeHeartClickModal']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		
		//Clicking on Social media icon 
		
		if(driver.findElement(By.xpath("//a[@class='f-snapchat']")) !=null){
			driver.findElement(By.xpath("//a[@class='f-snapchat']")).click();
		}
			else{
				System.out.println("Not found");
			}
		
		
	
		if(driver.findElement(By.xpath("//i[@aria-hidden='true'] * html/body/div[4]/div[2]/div/div[2]/a[2]")) != null ){
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[2]")).click();
		}
			else{
				System.out.println("Not found");
			}
		
		if(driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[3]/i")) ==null){
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[3]/i")).click();
		}
		
		else{
			System.out.println("Not found");
		}
		
		if(driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[4]/i")) ==null){
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[4]/i")).click();
		}
		
		else{
			System.out.println("Not found");
		}
		if(driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[5]/i")) ==null){
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[5]/i")).click();
		}
		
		else{
			System.out.println("Not found");
		}
		if(driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[6]/i")) ==null){
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/a[6]/i")).click();
		}
		
		else{
			System.out.println("Not found");
		}
		
		
		driver.findElement(By.xpath("//a[@href='/category/comedians'][1]")).click();
		
	    while(By.id("load_more_button") != null){
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.id("load_more_button"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		
		
		if(driver.findElement(By.id("load_more_button")) != null){
			driver.findElement(By.id("load_more_button")).click();
			
		
		if(driver.findElement(By.id("load_more_button")) == null){
			WebElement scroll1 = driver.findElement(By.id("load_more_button"));
			scroll.sendKeys(Keys.PAGE_DOWN);
			List<WebElement> allusers = driver.findElements(By.xpath("//img[@class='loaded']"));
			System.out.println("No of users = "+allusers.size());
			Assert.assertEquals("Comedians", Category.replace("", ""));
//		}
		
		}}}}}
	


