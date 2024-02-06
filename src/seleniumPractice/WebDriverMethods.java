package seleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);

        Dimension d = new Dimension(400,500);
        driver.manage().window().setSize(d);
        
        Thread.sleep(2000);
        
        Point p = new Point(600,700);
        driver.manage().window().setPosition(p);
        
        Thread.sleep(2000);
        
        driver.close();
        
        
		
		
		
	}
}
