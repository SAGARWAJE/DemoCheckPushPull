package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table1 {
     public static void main(String[] args) {
		WebDriver driver = AccessanyURL.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement stockclose = driver.findElement(By.xpath("//table//tbody//tr[5]//td[3]"));
		String name = stockclose.getText();
		System.out.println(name);
	}
}
