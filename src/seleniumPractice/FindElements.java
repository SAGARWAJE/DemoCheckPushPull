package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		
		List<WebElement> lists = driver.findElements(By.xpath("//li[@class=\"dropdown\"]"));
		System.out.println(lists.size());
		
		int all = lists.size();
		
		for(int i=0;i<=all-1;i++) {
    		WebElement value=lists.get(i);
    		String text=value.getText();
    		System.out.println(text);
    		if(text.equals("Bank Project")) {
    	    	
    	    	Actions action = new Actions(driver);
    	        action.moveToElement(value);
    	        action.click();
    	        action.perform();
    		}
           	else {
    			System.out.println("text not match");
    		}
    		
		}
	}
}

