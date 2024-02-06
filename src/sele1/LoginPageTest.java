package sele1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersAll.class)

public class LoginPageTest {
   WebDriver driver;
    
	@BeforeMethod
	public void openbrowser() {
		 WebDriver driver = AccessanyURL.openBrowser("https://kite.zerodha.com/"); 
	}
	@Test
	public void testemail() {
		ZerodhaPOM zerodhatest = new ZerodhaPOM(driver);
		zerodhatest.enteremail();
	}
	@Test	
	public void testpassword() {
		ZerodhaPOM zerodha = new ZerodhaPOM(driver);
		zerodha.enterpass();
		}
	@Test
	public void testlogin() {
	    ZerodhaPOM zerodhalogin = new ZerodhaPOM(driver); 
		zerodhalogin.clickonlogin();
	}
}
	