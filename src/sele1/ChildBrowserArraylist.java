package sele1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserArraylist {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/");
	
	WebElement practicepage = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	practicepage.click();
	practicepage.click();
	practicepage.click();
	
	ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
	
	int values = list.size();
	System.out.println(values);
	for(int i=0;i<values;i++) {//by using logic
		driver.switchTo().window(list.get(i));//switch that address window
		String currenttitle = driver.getTitle();
		if(currenttitle.equals("Practice Page")) {
			driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
			
		}
	}
   }
}
