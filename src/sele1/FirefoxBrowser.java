package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
         driver.get("https://www.amazon.in/");
	}
}
