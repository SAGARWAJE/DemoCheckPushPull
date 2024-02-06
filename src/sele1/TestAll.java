package sele1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TestAll {
     public static void main(String[] args) throws IOException, InterruptedException {
    	 
    //  1)Dropdown
//		WebDriver driver = AccessanyURL.openBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		WebElement dropDown = driver.findElement(By.xpath("//select[@class=\"col-lg-3\"]"));
//		Select select = new Select(dropDown);
//		//select.selectByIndex(2);
//		select.selectByValue("Google");
//		
//		WebElement get = driver.findElement(By.xpath("//select[@id=\"animals\"]"));
//		Select select1 = new Select(get);
//		//select1.selectByIndex(1);
//		select1.selectByValue("Cat");
		
	//	2)Screenshot
//    	 WebDriver ss =AccessanyURL.openBrowser("https://www.amazon.in/");
//    	 File source = ((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
//    	 File destination = new File("C:\\selenium\\selenium ss\\amazon.jpg");
//    	 FileHandler.copy(source, destination);
//		
    //  3)popups
//    	 WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/selenium/practice.html#serviceid");
//    	 WebElement alert1 = driver.findElement(By.xpath("//input[@id=\"alertbtn\"]"));
//    	 alert1.click();
//    	 Alert a = driver.switchTo().alert();
//    	 a.accept();
//    	 
//    	 WebElement alert2 = driver.findElement(By.xpath("//input[@id=\"confirmbtn\"]"));
//    	 alert2.click();
//    	 Alert b = driver.switchTo().alert();
//    	 b.accept();
//    	 
//    	 WebElement alert3 = driver.findElement(By.xpath("//input[@name=\"enter-name\"]"));
//    	 alert3.sendKeys("sagar");
//    	 WebElement alert4 =driver.findElement(By.xpath("//input[@id=\"confirmbtn\"]"));
//         alert4.click();
//     	 Alert c = driver.switchTo().alert();
//    	 c.accept();
    	 
    //   4)Iframe
//       WebDriver driver = AccessanyURL.openBrowser("https://demoqa.com/frames");
//    	 WebElement frame1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
//    	 frame1.click();
//    	
  //  	 5)MouseActionMoveClickANDSend
    	 WebDriver driver = AccessanyURL.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
    	 Actions action = new Actions(driver);
         Thread.sleep(2000);
    	 WebElement a = driver.findElement(By.xpath("(//h2[@class='resp-accordion'])[2]"));
   	     a.click();
		 WebElement iframe = driver.findElement(By.xpath("(//iframe[@class=\"demo-frame lazyloaded\"])[2]"));
		 driver.switchTo().frame(iframe);
		 
		 WebElement image = driver.findElement(By.xpath("(//div[@id=\"draggable\"])[1]"));
		 WebElement trash = driver.findElement(By.xpath("(//div[@id=\"droppable\"])[1]"));
		 
	     action.dragAndDrop(image, trash);
	     action.perform();
	     
	}
}
