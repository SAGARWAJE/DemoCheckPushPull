package seleniumPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplementParametrizationMain {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		String username = ParametrizationMain.getData("Sheet1", 0, 1);
		email.sendKeys(username);
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        String pass = ParametrizationMain.getData("Sheet1",1 , 1);
		password.sendKeys(pass);
		
}
}
