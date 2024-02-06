package sele1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    public static void main(String[] args) {
		WebDriver driver = AccessanyURL.openBrowser("http://demo.guru99.com/test/ajax.html");
		
		List<WebElement> headings = driver.findElements(By.xpath("//li[@class=\"dropdown\"]"));
		System.out.println(headings.size());
		headings.get(1).click();
		
	}
}
