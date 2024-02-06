package seleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {

    public static void main(String[]args) throws InterruptedException {
    
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications");

	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	
	
	
//	WebElement w = driver.findElement(By.xpath("//input[@type=\"radio\"][1]"));
//	w.click();
//	w.isSelected();
//	System.out.println(w);
//	w.isDisplayed();
//	System.out.println(w);
//	w.isEnabled();
//	System.out.println(w);
//	w.getText();
//	System.out.println(w);
	
	WebElement agile = driver.findElement(By.xpath("//a[text()='Agile Project']"));
	agile.click();

	WebElement close = driver.findElement(By.xpath("//span[text()='Close']"));
	Thread.sleep(1000);
	close.click();
	
	WebElement id = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	id.sendKeys("sagar");
	
	
	
	
	
}
}

