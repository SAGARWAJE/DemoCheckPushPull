package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivision {
    public static void main(String[] args) {
		WebDriver driver = AccessanyURL.openBrowser("https://www.facebook.com/login/");
		
		WebElement forget = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		forget.click();
	    
		WebElement email = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		email.sendKeys("jnd@gmail.com");
		WebElement cancel = driver.findElement(By.xpath("//a[@role=\"button\"]"));
		cancel.click();
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signup.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstname.sendKeys("Sagar");
	}
}
