package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
     public static void main(String[] args) throws InterruptedException  {
   
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
	
		
		WebElement newtab = driver.findElement(By.xpath("//input[@name=\"NewTab\"]"));
		newtab.click();
	
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		
		String a = list.get(1);
		driver.switchTo().window(a);
	
		
		WebElement window1 = driver.findElement(By.xpath("//span[text()='Watch free courses']"));
		window1.click();
		int s =list.size();
		System.out.println(s);
		
		String b = list.get(2);
		driver.switchTo().window(b);
		
	
//		WebElement cancel = driver.findElement(By.xpath("//yt-formatted-string[text()='Cancel']"));
//		cancel.click();
        
        
		
		
		Set<String> addresses = driver.getWindowHandles();//gives the address of all the page that are open
		Iterator<String> i = addresses.iterator();

		while(i.hasNext()) {//true
			String address = i.next();//gives the first value
			driver.switchTo().window(address);//switch that address window
			String address1 = i.next();//gives the first value
			driver.switchTo().window(address1);
			String address2 = i.next();//gives the first value
			driver.switchTo().window(address2);
			Thread.sleep(2000);
			String currenttitle = driver.getTitle();
			Thread.sleep(2000);
			if(currenttitle.equals("qavbox - YouTube")) {
				
				WebElement cancel = driver.findElement(By.xpath("//yt-formatted-string[text()='Cancel']"));
				cancel.click();
			
		}
	}
     }
     }
