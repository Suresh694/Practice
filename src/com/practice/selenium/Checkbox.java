package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	WebDriver driver;
	void selectcheckbox() {
		try {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("http://book.theautomatedtester.co.uk/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href=\"/chapter1\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();;
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox obj=new Checkbox();
		obj.selectcheckbox();
	}

}
