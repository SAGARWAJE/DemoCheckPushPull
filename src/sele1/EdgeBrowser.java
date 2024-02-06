package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
    	System.setProperty("webdriver.edge.driver","C:\\selenium\\edgedriver_win64 (2)\\msedgedriver.exe");
    	WebDriver driver = new EdgeDriver();
         driver.get("https://www.flipkart.com/");
	}
}
