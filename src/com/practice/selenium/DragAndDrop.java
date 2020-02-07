package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	WebDriver driver;
	 void dragandDrop() {
		 try {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			 
			 driver.navigate().to("http://book.theautomatedtester.co.uk/");
			 Thread.sleep(3000);
			 WebElement chapter1=driver.findElement(By.xpath("//a[@href=\"/chapter1\"]"));
			 Thread.sleep(3000);
			 WebElement input= driver.findElement(By.xpath("//input[@type='text']"));
			 Thread.sleep(3000);
			 Actions act=new Actions(driver);
			 act.dragAndDrop(chapter1, input).build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop obj=new DragAndDrop();
		obj.dragandDrop();
	}

}
