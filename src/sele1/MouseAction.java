package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		
      WebDriver driver = AccessanyURL.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
      
      Actions action = new Actions(driver);
      
      WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
      iframe.click();
      driver.switchTo().frame(iframe);
      
      WebElement image = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
      WebElement trash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
      
      action.dragAndDrop(image, trash);
      action.perform();
    
}
}