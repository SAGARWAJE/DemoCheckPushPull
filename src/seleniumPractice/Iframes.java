package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	   driver.manage().window().maximize();
	   
	   WebElement iframe1 = driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]"));
	   driver.switchTo().frame(iframe1);
	  
	   
	   
	   WebElement clickdisplay = driver.findElement(By.xpath("//button[@type=\"button\"]"));
	   clickdisplay.click();
	   System.out.println(clickdisplay.getText());
	   
	   WebElement afterclicktext = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
	   System.out.println(afterclicktext.getText());
	  
	   
 }
}
