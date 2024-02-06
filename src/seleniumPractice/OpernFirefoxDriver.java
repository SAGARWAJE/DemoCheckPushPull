package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpernFirefoxDriver {
    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("sgarwaje");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pass.sendKeys("hvjasj");
		
		WebElement login = driver.findElement(By.xpath("//button[text()=\"Log In\"]"));
		login.click();
		
		
	}
	
}
