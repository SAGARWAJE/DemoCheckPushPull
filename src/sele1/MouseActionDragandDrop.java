package sele1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragandDrop {
   public static void main(String[] args) throws InterruptedException {
     WebDriver driver = AccessanyURL.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
     
     Actions action = new Actions(driver);
//   1)Switch to iframes
     WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
     driver.switchTo().frame(iframe);
     
     List<WebElement> images = driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
     int num = images.size();//find elements returns alist of webelement
     
//   2)Drag and Drop
     for(int i=0;i<=num;i++) {//0,1,2,3,4
    	 WebElement image = images.get(i);
    	 WebElement trash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
    	 action.dragAndDrop(image, trash);
    	 action.perform();
    	 Thread.sleep(2000);
    	 
     }  
  }
}
