package sele1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Asserts {
    WebDriver driver;
    
    @BeforeMethod
    public void browser() {
    	driver=AccessanyURL.openBrowser("https://kite.zerodha.com/");
    }
	@Test
    public void PutAsserts() {
    	ZerodhaPOM zerodhalogin = new ZerodhaPOM(driver);
    	zerodhalogin.clickonlogin();
    	String text= zerodhalogin.getErrorText();//for that always create method in POM class
    	String expectedtext = "User ID should be minimum 6 characters.";
    	System.out.println(text);
    	
//    	1)SoftAssert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(text, expectedtext);
        
//      2)HardAssert
       // Assert.assertEquals(text, expectedtext);
        
        driver.close();
    }
}
