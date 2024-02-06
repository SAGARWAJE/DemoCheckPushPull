package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Iframes {
	  public static void main(String[] args) throws InterruptedException {
		  
      WebDriver driver = AccessanyURL.openBrowser("http://demo.automationtesting.in/Frames.html");
      
  //  1)From double iframes to single iframes bcoz the text field of double iframe is prent in single iframe
      
      WebElement doubleframe = driver.findElement(By.xpath("//a[@href=\'#Multiple\']"));
      doubleframe.click();
      WebElement multiframe = driver.findElement(By.xpath("//iframe[@src=\'MultipleFrames.html\']"));
      driver.switchTo().frame(multiframe);
      WebElement singleframe = driver.findElement(By.xpath("//iframe[@src=\'SingleFrame.html\']"));
      driver.switchTo().frame(singleframe);
//    driver.switchTo().frame();//frame with index
//    driver.switchTo().frame("")//frame with ID
      WebElement entertext = driver.findElement(By.xpath("//input[@type='text']"));
      entertext.sendKeys("sagar");
     
  //  2)to select single frames text field
      
//      WebElement singleframe = driver.findElement(By.xpath("//iframe[@src=\'SingleFrame.html\']"));
//      driver.switchTo().frame(singleframe);
//      WebElement entertext = driver.findElement(By.xpath("//input[@type='text']"));
//      entertext.sendKeys("sagar");
//      
      
  //  3)to go home page from any frame
      
      driver.switchTo().defaultContent();//switch focus from any frame to home page
      WebElement homepage = driver.findElement(By.xpath("//a[text()='Home']"));
      homepage.click();
      
      
      
      
}
}