package sele1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngInotationsWithParameters {

	@Test(timeOut=1000)
	public void testa() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("testa run");
	}
	@Test(priority = 1)
	public void testb() {
		System.out.println("testb run");
	}
	@Test(priority = -1,invocationCount = 2)
	public void testc() {
		System.out.println("testc run");
	}
	@Test(dependsOnMethods = {"testa"})
	public void testd() {
		System.out.println("test d run");
	}
	@Test(enabled = false)//not run if we put enabled=false
	public void teste() {
		System.out.println("test e run");
	}
	@Test
	public void testf() {
		System.out.println("test f run");
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
