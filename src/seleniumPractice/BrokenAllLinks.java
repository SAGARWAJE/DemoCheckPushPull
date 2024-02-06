package seleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenAllLinks {
   public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	   List<WebElement> list = driver.findElements(By.tagName("a"));
	   Iterator<WebElement> it = list.iterator();
	   
	   int brokenlinks=0;
	   while(it.hasNext()) {
		   String url = it.next().getAttribute("href");
		   
		   if (url==null || url.isEmpty()) {
			   System.out.println("url is empty or invalid");
			   continue;
		   }
		   try {
			   URL u = new URL(url);
			   HttpURLConnection huc = (HttpURLConnection )u.openConnection();
			   huc.setRequestMethod("HEAD");
			   huc.connect();
			    
			   int statuscode = huc.getResponseCode();
			   System.out.println(statuscode);
			   if(statuscode >= 400) {
				   System.out.println(url + "link is broken");
				   brokenlinks++;
				   
			   }
			   else {
				   System.out.println(url + "link is working");
			   }
			   System.out.println(brokenlinks);
		   }
		   catch(Exception e) {
			   
		   }
	   }
   }
}
	   

