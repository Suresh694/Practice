package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BeginnersGuideSite {
	
	static void mousehover() {
		try {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://book.theautomatedtester.co.uk/");
			Thread.sleep(2000);
			WebElement chapter1=driver.findElement(By.xpath("//a[@href=\"/chapter1\"]"));
			
			Actions act=new Actions(driver);
			act.moveToElement(chapter1).build().perform();;
			Thread.sleep(7000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeginnersGuideSite obj=new BeginnersGuideSite();
		obj.mousehover();

	}

}
