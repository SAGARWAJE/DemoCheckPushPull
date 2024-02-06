package sele1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
    
	@DataProvider(name="name data eg-sagar")
	public Object[][]data(){
		return new Object[][] {{"sagar"},{"ashish"},{"akshay"}};
	}
	@Test(dataProvider="name data eg-sagar")
	public void Gototest(String value) {
		System.out.println(value);
	}
	
}
