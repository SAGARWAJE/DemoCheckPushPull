package sele1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserAddress1 {
     public static void main(String[] args) {
		WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/");
		
		WebElement startpractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		startpractice.click();
		startpractice.click();
		startpractice.click();
		
		String address = driver.getWindowHandle();//gives the address of main page
		System.out.println(address);
		
		Set<String> addresses = driver.getWindowHandles();//gives the addresses of all pages that are open including main page also
		Iterator<String> i = addresses.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
//getWindowsHandle method of webdriver written all the addresses of chrome windows that are open in the form of set of string
//set doesnot maintain  insertion order of address and also doesnot accept duplicate value
		
//In order to get set value we use iterator method of set interface which written complete iterator interface 
//Then by using "next" method of iterator interface we can get the values from set
		
	}
}
