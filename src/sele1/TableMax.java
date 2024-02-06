package sele1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableMax {
     public static void main(String[] args) {
 		WebDriver driver = AccessanyURL.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize = column.size();
		System.out.println(columnsize);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);
		
		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int pricesize =currentprice.size();
		System.out.println(pricesize);
		
		double max=0;
		
		for(int i=0;i<pricesize;i++) {
			WebElement price = currentprice.get(i);
			String allpricevalue = price.getText();
			
	   double no = Double.parseDouble(allpricevalue);
		
		if(no > max) {
			max = no;
		}
	  }
		System.out.println(max);
     }

	}

