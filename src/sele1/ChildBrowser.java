package sele1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
    public static void main(String[] args) {
		
    	WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/");
    	
    	WebElement practicepage = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
    	practicepage.click();
    	practicepage.click();
    	practicepage.click();
	
	
    	Set<String> addresses = driver.getWindowHandles();//1st step
	    ArrayList<String> list = new ArrayList<String>(addresses);//2nd step

//	    1)1st window 

	    String windowindex1 = list.get(1);//3rd step
	    driver.switchTo().window(windowindex1);//4th step
	    WebElement radio1 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		radio1.click();
		
//		2)2nd window

		String windowindex2 = list.get(2);
	    driver.switchTo().window(windowindex2);
	    WebElement radio2 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		radio2.click();
		
//		3)3rd window

		String windowindex3 = list.get(3);
	    driver.switchTo().window(windowindex3);
	    WebElement radio3 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]"));
		radio3.click();
		
		driver.quit();
}
}