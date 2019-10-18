package com.DemoJunit;

import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassB {
	private WebDriver driver;
	
	@Test
    public void test_B1() throws MalformedURLException {
        System.out.println("Class B");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.cl/login");
		driver.manage().window().maximize();
    }
 
	/*
    @Test
    public void test_B2() {
        System.out.println("Class B Test 2");
    }
     
    @Test
    public void test_B3() {
        System.out.println("Class B Test 3");
    }
 
    @Test
    public void test_B4() {
        System.out.println("Class B Test 4");
    }
    */
}
