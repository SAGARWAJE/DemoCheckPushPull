package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToselectCheckBox {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver = AccessanyURL.openBrowser("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id=\"vfb-7-1\"]"));
		radio1.click();
		
		Thread.sleep(3000);
		
		WebElement radio2 = driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]"));
		radio2.click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id=\"vfb-6-1\"]"));
		checkbox2.click();
		
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]"));
		checkbox3.click();
		
		boolean result = radio2.isSelected();
		System.out.println(result);
		
		boolean result1 = checkbox1.isSelected();
	    System.out.println(result1);
		
		
	}
}
