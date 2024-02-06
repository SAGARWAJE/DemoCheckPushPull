package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TDNLKSgzMrA0YLRSNagwTko2SkozN0yEgCQrg4pkS8vkpFSTJCPzNENjQyNTL6Gk3GSF4vy0kvLEolSFzLyUzEQALLwW2w&q=bmc+software+india&oq=&aqs=chrome.6.35i39i362l3j46i39i175i199i362j46i39i199i362i465j35i39i362j46i39i175i199i362j35i39i362.15089j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		
		WebElement terms = driver.findElement(By.xpath("(//a[@class=\"Fx4vi wHYlTd ZYHQ7e\"])[3]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", terms);
		
		Thread.sleep(5000);
		
		WebElement tools = driver.findElement(By.xpath("//div[@class=\"t2vtad\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", tools);
		
		
}
}
