package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActionMoveClickANDSend {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		act.moveToElement(email);
		act.sendKeys("sagar");
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		act.moveToElement(pass);
		act.sendKeys("waje");
		
		Thread.sleep(5000);
		
//		WebElement show = driver.findElement(By.xpath("//div[@class=\"_9lsa\"]"));
//		act.moveToElement(show);
//		act.click(show);
//		Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		act.moveToElement(login);
		act.click();
	
		act.perform();
		
		
	}
}
