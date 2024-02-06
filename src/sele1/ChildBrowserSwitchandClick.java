package sele1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserSwitchandClick {
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/");
		
		WebElement practicepage = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		practicepage.click();
		
		Set<String> addresses = driver.getWindowHandles();//gives the address of all the page that are open
		Iterator<String> i = addresses.iterator();

		while(i.hasNext()) {//true
			String address = i.next();//gives the first value
			driver.switchTo().window(address);//switch that address window
			Thread.sleep(2000);
			String currenttitle = driver.getTitle();
			Thread.sleep(2000);
			if(currenttitle.equals("Practice Page")) {
				
			WebElement radio1 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
			radio1.click();
			
		}
		
      }
      
   }
}
