package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParametrizationMain {
	public static String getData (String sheetName,int row,int cell) throws EncryptedDocumentException, IOException   {
		   FileInputStream file = new FileInputStream("C:\\selenium\\Test Data excel files\\excel data for facebook.xlsx");
		   String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		   return value;
	   }
	
	
}
