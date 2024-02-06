package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxORDropdown {
     public static void main(String[] args) {
		
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    	 driver.manage().window().maximize();
    	 
    	 WebElement value = driver.findElement(By.xpath("//select[@class=\"col-lg-3\"]"));
    	 
    	 Select s = new Select(value);
    	 s.selectByIndex(2);
    	 s.selectByValue("Yahoo");
    	 s.selectByVisibleText("Google");
    	 
    	 WebElement multiple = driver.findElement(By.xpath("//select[@id=\"second\"]"));
    	 Select ss = new Select(multiple);
    	 ss.selectByIndex(3);
    	 ss.selectByValue("pizza");
    	 ss.selectByVisibleText("Burger");
    	 
	}
}
