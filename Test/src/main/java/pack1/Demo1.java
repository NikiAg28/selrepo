package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	 WebDriver driver;
	 
	@BeforeTest 
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");	        
	    driver = new ChromeDriver();
		
	}
	
	@Test(groups = {"Smoke"} )
	public void method1() {
		
		System.out.println("method 1 output");
	}
	
	@Test(groups = {"Sanity"} )
	public void method2() {
		
		System.out.println("method 2 output");
	}
	
	@Test(groups = {"Smoke"} )
	public void method3() {
		
		System.out.println("method 3 output");
	}
	
	@Test(groups = {"Sanity"} )
	public void method4() {
		
		System.out.println("method 4 output");
	}
	
	@Test(groups = {"Smoke"} )
	public void method5() {
		
		System.out.println("method 5 output");
	}
	
	@Test(groups = {"Sanity"} )
	public void method6() {
		
		System.out.println("method 6 output");
	}
	
	@Test
	public void closeBrowser() {
		
		driver.close();
		driver.quit();
	}
}
