package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPOM {
       
        @FindBy(xpath="//input[@id=\"userid\"]")private WebElement email;
    	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pass;
    	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement login;
    	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
    	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
        @FindBy(xpath="//span[text()=\"User ID should be minimum 6 characters.\"]")private WebElement userIDerror;//fort assert
        
        public ZerodhaPOM(WebDriver driver) {
        	PageFactory.initElements(driver, this);
        }
        
        public void enteremail(){
        	email.sendKeys("sagar@gmail.com");
        }
        public void enterpass(){
        	pass.sendKeys("hsjkl");
        }
        public void clickonlogin(){
 	        login.click();
        }
        public void forgotpass(){
 	        forgot.click();
        }
        public void signup(){
 	        signup.click();
        }
        public String getErrorText() {
        	String text=userIDerror.getText();
        	return text;
        }
	}

