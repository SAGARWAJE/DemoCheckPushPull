package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHiddenDivisionAlert {
     
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement hidden = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		hidden.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement hidden1 = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		hidden1.click();
		Thread.sleep(2000);
		Alert b = driver.switchTo().alert();
		b.accept();
		
		WebElement hidden2 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		hidden2.click();
		Thread.sleep(2000);
		Alert c = driver.switchTo().alert();
		c.sendKeys("sagar");
		Thread.sleep(2000);
		String s =a.getText();
		System.out.println(s);
		c.accept();
		
		
	}
}
