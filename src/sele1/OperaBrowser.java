package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class OperaBrowser {
       public static void main(String[] args) {
    	   System.setProperty("webdriver.opera.driver","C:\\selenium\\operadriver_win64\\operadriver_win64\\operadriver.exe");
       	WebDriver driver = new OperaDriver();
            driver.get("https://www.apple.com/in/iphone/");
	}
}
