package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting chrome diver class to webdriver
		driver.get("https://www.facebook.com/login/");//method of webdriver interface
		
	//	driver.navigate().to("https://www.facebook.com/login/");//helps to open url
		
	//	WebElement email = driver.findElement(By.id("email"));//locator by id
	//	email.sendKeys("sagarwaje@gmail.com");
		
	//	WebElement pass = driver.findElement(By.name("pass"));//locator by pass
	//	pass.sendKeys("kjdqk");
		
	//	WebElement login = driver.findElement(By.tagName("button"));//locator by tagname
   //   login.click();
		
	//	WebElement forgot = driver.findElement(By.className("_97w4"));//locator by classname
	//	forgot.click();
		
	//	WebElement signup = driver.findElement(By.className("_97w5"));//locator by classname
	//	signup.click();
		
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));//locator by css selector
		email.sendKeys("sagarwaje143@gmail.com");
		
		WebElement pass = driver.findElement(By.cssSelector("input[name='pass']"));//locator by css selector
		pass.sendKeys("qghskui");
		
		WebElement login = driver.findElement(By.linkText("Log In"));//link test
		login.click();
		
		WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));//partial linked test
		forgot.click();
		
		
	}
}
