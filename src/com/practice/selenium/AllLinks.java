package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLinks {
	WebDriver driver;
	public void collectlinks() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver =new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("http://book.theautomatedtester.co.uk/");
		WebElement chapter1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/chapter1\"]")));
		
		if (chapter1.isDisplayed()) {
			 chapter1.click();
			 List<WebElement> all=driver.findElements(By.xpath("//div"));
			 
			 for (WebElement onebyone : all) {
				if (onebyone.isDisplayed()) {
					String one=onebyone.getText();
					System.out.println(one);
				}
			}
			 System.out.println(all);
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllLinks obj=new AllLinks();
		obj.collectlinks();

	}

}
