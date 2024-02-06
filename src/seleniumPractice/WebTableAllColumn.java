package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAllColumn {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr//th"));
		int size = column.size();
		
		for(int i=0;i<size;i++) {
			WebElement value = column.get(i);
			String allcolumn = value.getText();
			System.out.println(allcolumn);
		}
	}
}
