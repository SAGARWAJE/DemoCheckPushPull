package sele1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
     public static void main(String[] args) {
		 WebDriver driver = AccessanyURL.openBrowser("https://www.facebook.com/login/");
		 
		 List<WebElement> list = driver.findElements(By.tagName("a"));
		 Iterator<WebElement> it = list.iterator();
		 int brokenlink = 0;
		 while(it.hasNext()){
			 String url = it.next().getAttribute("href");
			 
			 if(url==null || url.isEmpty()) {
				 System.out.println("url is empty or invalid");
				 continue;
			 }
		
		 try {
			 URL u = new URL(url);
			 HttpURLConnection huc = (HttpURLConnection)u.openConnection();
			 huc.setRequestMethod("HEAD");
			 huc.connect();
			 
			 int statuscode = huc.getResponseCode();
			 System.out.println(statuscode);
			 if(statuscode >= 400) {
				 System.out.println(url + "link is broken");
				 brokenlink++;
				 
			 }
			 else {
				 System.out.println(url + "link is working");
			 } 
			 System.out.println(brokenlink);
		 }
		 
		 catch(Exception e) {
			 
		 }
		
	  }
     }	 
}
