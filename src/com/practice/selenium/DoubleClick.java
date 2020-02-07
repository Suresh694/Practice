package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	WebDriver driver;
	//DoubleClick perform Succesfully
	void doubleclick() {
		try {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
			driver.get("http://book.theautomatedtester.co.uk/");
			Thread.sleep(2000);
			WebElement chapter1=driver.findElement(By.xpath("//a[@href=\"/chapter1\"]"));
			Actions act=new Actions(driver);
			act.doubleClick(chapter1).perform();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleClick obj=new DoubleClick();
		obj.doubleclick();
	}

}
