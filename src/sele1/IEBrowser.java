package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	public class IEBrowser {
	     public static void main(String[] args) {
	    		System.setProperty("webdriver.ie.driver","C:\\selenium\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
	        	WebDriver driver = new InternetExplorerDriver();
	             driver.get("https://www.apple.com/in/iphone/");
		}
	}

