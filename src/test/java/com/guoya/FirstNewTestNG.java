package com.guoya;

import java.sql.Driver;

import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstNewTestNG {
	 WebDriver driver;
	  //设置全局变量

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	 
      System.setProperty("webdriver.chrome.driver", "c:/software/chromedriver.exe");
      //指明驱动class,及驱动位置
       driver= new ChromeDriver();
       //定义变量
     driver.get("http://127.0.0.1:8080/yansl/MyHtml.html"); 
     Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() {
//	  driver.quit();
  }
  @Test
  public void username() throws InterruptedException {
	  Thread.sleep(500);
//       WebElement nameElement = driver.getPageSource(By.id("login"));
	  WebElement userName = driver.findElement(By.id("login"));
	  userName.sendKeys("da");
	  
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("xiao");
	  
	  WebElement dian =  driver.findElement(By.xpath("//input[@type='submit']"));
	  dian.click();
	  
	  boolean result = driver.getPageSource().contains("get");
		Assert.assertEquals(true,result );
}
//  @Test
//  public void password() throws InterruptedException{
//	  Thread.sleep(2000);
//	  WebElement password = driver.findElement(By.id("password"));
//	  password.sendKeys("xiao");
//  }
//  @Test
//  public void click() throws InterruptedException{
//	  Thread.sleep(4000);
//	  WebElement dian =  driver.findElement(By.xpath("//input[@type='submit']"));
//	  dian.click();
//  }
//  @Test
//  public void result() throws InterruptedException{
//	  Thread.sleep(6000);
//	  boolean result = driver.getPageSource().contains("get");
//	Assert.assertEquals(true,result );  
//  }
  
}






