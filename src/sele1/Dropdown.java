package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
		WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select = new Select(dropDown);
     //	select.selectByIndex(2);
     //	select.selectByValue("option1");
		select.deselectByVisibleText("option1");
		
	}
}
