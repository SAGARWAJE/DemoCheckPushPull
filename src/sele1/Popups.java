package sele1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popups {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = AccessanyURL.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		alert1.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		alert2.click();
		Alert b = driver.switchTo().alert();
		b.accept();
		b.dismiss();
		
		WebElement alert3 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		alert3.click();
		Alert c = driver.switchTo().alert();
		Thread.sleep(2000);
		c.sendKeys("sagar");
		Thread.sleep(2000);
		c.accept();
		
		}
}
