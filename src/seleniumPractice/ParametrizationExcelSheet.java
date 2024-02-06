package seleniumPractice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParametrizationExcelSheet {
    public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\selenium\\Test Data excel files\\Test Data.xlsx");
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		String name = WorkbookFactory.create(file).getSheet("Sheet2").getRow(5).getCell(2).getStringCellValue();
		email.sendKeys(name);
		
		Thread.sleep(5500);
		
		WebElement password = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		String pass = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		password.sendKeys(pass);
	}
}
