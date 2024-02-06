package sele1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookbyExcelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		WebDriver driver = AccessanyURL.openBrowser("https://www.facebook.com/login/");

		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		String username = Parametrization.getData("Sheet1", 0, 1);
		email.sendKeys(username);
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        String pass = Parametrization.getData("Sheet1",1 , 1);
		password.sendKeys(pass);
		
	}
}    