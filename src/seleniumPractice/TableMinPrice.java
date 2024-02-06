package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableMinPrice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> allprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int size = allprice.size();
		
		double min = 0;
		
		for(int i=0;i<size;i++) {
			WebElement values = allprice.get(i);
			String allvalues = values.getText();
			
			double no = Double.parseDouble(allvalues);
			
			if(i==1) {
				min=no;
			}else if(no<min) {
				min=no;
			}
		}
		
		System.out.println(min);
	}
}
