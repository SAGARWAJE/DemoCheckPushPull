package sele1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting chrome diver class to webdriver
		driver.get("https://www.facebook.com/login/");//method of webdriver interface
		
	//	driver.navigate().to("https://www.facebook.com/login/");//helps to open url
	//	Thread.sleep(3000);//execution stop for given time
		
	//	driver.navigate().back();//navigate is the method of webdriver which returns a complete interface navigation
	//	Thread.sleep(3000);
		
	//	driver.navigate().forward();
	//	Thread.sleep(3000);
		
	//	driver.navigate().refresh();
		
	//	String title = driver.getTitle();
	//	System.out.println(title);
		
	//	String url = driver.getCurrentUrl();
	//	System.out.println(url);
		
		driver.manage().window().maximize();//to maximize browser
		driver.manage().window().minimize();
		
		Dimension d = new Dimension(100,200);
		driver.manage().window().setSize(d);
		
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);
				
	}
}