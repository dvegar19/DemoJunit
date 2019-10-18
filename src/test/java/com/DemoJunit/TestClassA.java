package com.DemoJunit;

import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassA {
	private WebDriver driver;
	
	@Test
	public void test_A1() throws MalformedURLException{
		System.out.println("Class A");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://200.111.183.147:8095/login");
		driver.manage().window().maximize();
	}
	 
	/*
	@Test
	public void test_A2(){
	    System.out.println("Class A Test 2");
	}
	 
	@Test
	public void test_A3(){
	    System.out.println("Class A Test 3");
	}
	 
	@Test
	public void test_A4(){
	    System.out.println("Class A Test 4");
	}
	*/
}
