package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
     public static void main(String[] args) throws IOException  {
		
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    	 driver.manage().window().maximize();
    	 
    	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	File destination = new File("C:\\sample ss from selenium//we.jpg");
    	
    	FileHandler.copy(source, destination);
    	
    	 
    	 
	}
}
