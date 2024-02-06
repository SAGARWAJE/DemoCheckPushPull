package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver = AccessanyURL.openBrowser("https://demoqa.com/text-box");
		
		WebElement fullname = driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
		fullname.sendKeys("sagar waje");
		
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    
	    action.sendKeys(Keys.TAB);
	    action.sendKeys("sagar@gmail.com");
	    action.sendKeys(Keys.TAB);
	    action.sendKeys("AP OMKAR RESIDENCY B WING MANCHAR");
	    action.sendKeys(Keys.TAB);
	    action.sendKeys("SAME AS ABOVE");
	    WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	    action.moveToElement(submit);
	    action.click();
	    action.perform();

	}
}
