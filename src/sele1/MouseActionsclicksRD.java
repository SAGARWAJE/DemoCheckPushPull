package sele1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsclicksRD {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = AccessanyURL.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		
 //		1)RIGHT CLICK//(control+shift+i --> to find element)

		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightclick);
		action.perform();
		Thread.sleep(2000);
        action.click();
        
 //       2)DOUBLE CLICK

		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleclick);
        action.perform();
        Alert a= driver.switchTo().alert();
        a.accept();

 //       3)MOVE CURSOR AND CLICK
       
        WebElement demosite = driver.findElement(By.xpath("(//a[@title=\"Home\"])[2]"));
        action.moveToElement(demosite);
        action.perform();
        action.click();
        action.perform();
        
	}
}
