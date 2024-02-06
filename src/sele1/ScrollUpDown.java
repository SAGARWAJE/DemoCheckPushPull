package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown {
  public static void main(String[] args) {
	WebDriver driver = AccessanyURL.openBrowser("https://vctcpune.com/selenium/practice.html");
	
//	1)UP
	WebElement hide = driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]"));
     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", hide);
     //((JavascriptExecutor)driver).executeScript("window.scrollBy(100,200)");
//	2)DOWN
     WebElement radio = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", radio);
}
}
