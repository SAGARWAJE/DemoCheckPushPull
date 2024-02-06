package sele1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
     WebDriver driver;
     @FindBy(xpath="\\xpath")private WebElement pin;//for reference of explicit wait
     
//	1)Implicit wait are use in open browser time method
     
	public static  WebDriver ImplicitWait() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
   	 WebDriver driver = new ChromeDriver();
   	 driver.get("url");
   	 driver.manage().window().maximize();
   	 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        return driver;
	}

//  2)Explicit wait	are use in POM for particular method
	
	public void ExplictWaits() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));//explicit wait
		wait.until(ExpectedConditions.visibilityOf(pin));//will recheck element in every 500ms
		pin.sendKeys("862038");
	}
	
//  3)Fluent wait are use in POM class method
		
	public void fluent(WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(50000));//total wait time
		wait.pollingEvery(Duration.ofMillis(5000));//polling time or rechecking time
		wait.ignoring(Exception.class);//exception ignore
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys("7822869");
	}
}
