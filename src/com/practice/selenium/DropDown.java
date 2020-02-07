package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	void selectdropdown() {
		try {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.navigate().to("http://book.theautomatedtester.co.uk/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href=\"/chapter1\"]")).click();
			Thread.sleep(5000);
			WebElement drop=driver.findElement(By.xpath("//select[@id='selecttype']"));
			Select obj=new Select(drop);
			obj.selectByIndex(3);
			Thread.sleep(2000);
			obj.deselectAll();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown obj=new DropDown();
		obj.selectdropdown();
	}

}
