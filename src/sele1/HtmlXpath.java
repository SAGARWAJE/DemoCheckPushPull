package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlXpath {
     public static void main(String[] args) throws InterruptedException {
    	 
    		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();//upcasting chrome diver class to webdriver
    		driver.get("https://www.facebook.com/login/");//method of webdriver interface
    		
    		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));//xpath By attribute
         	email.sendKeys("sagarrwaje@gmail.com");
    		
    		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));//xpath By attribute
    		pass.sendKeys("kjdlj");
    		
    		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'_42ft _')]"));//xpath By contains
    		login.click();
    		Thread.sleep(3000);
    		
    		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));//xpath By text
    	 	forgot.click();
    	
    	
	}
}
