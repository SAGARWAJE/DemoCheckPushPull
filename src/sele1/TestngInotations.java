package sele1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngInotations {

	@Test
	public void test1() {
		System.out.println("test1 run");
	}
	@Test
	public void test2() {
		System.out.println("test2 run");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass run");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass run");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod run");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod run");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest run");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest run");
	}
}
