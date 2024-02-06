package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtocreateWindowsObject {
     public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    	 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.facebook.com/login/");
		
	//	1)windows maximize by creating object of options method
		
    //  Options options = driver.manage();//manage method returns option interface
	//	Window win = options.window();	//window method of option interface returns window interface
	//	win.maximize();		//we use maximize method of window interface

	//	2)windows maximize by Direct
        driver.manage().window().maximize();//to maximize browser
        
	}
}
