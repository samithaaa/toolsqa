package org.ictkerala.toolsqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe"); //iframe html within html
		//frame can be done using index also
		WebElement nse=driver.findElement(By.id("nseindex"));
		
		String s=nse.getText();
		System.out.println(s);
		driver.switchTo().parentFrame();
	}

}
