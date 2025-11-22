package org.ictkerala.toolsqa;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestClass {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/browser-windows");
	
	WebElement new_tab=driver.findElement(By.id("tabButton"));
	String parentid=driver.getWindowHandle();
	new_tab.click();
	
	Set<String> handles=driver.getWindowHandles();
	
	for(String id:handles)
	{
		if(!id.equals(parentid))
		{
			driver.switchTo().window(id);
			break;
		}
	}
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(parentid);	
	
	}

}
