package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement amount = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement place = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		
//		act.dragAndDrop(amount, place);//1st method
//		act.perform();
		
		
		act.moveToElement(amount);//2nd method
		act.clickAndHold();
		act.moveToElement(place);
		act.release();
		act.perform();
		
		
 }
}
