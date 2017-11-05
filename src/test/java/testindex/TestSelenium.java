package testindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	 public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","C:/software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 Thread.sleep(2000);
		 
		 driver.get("http://127.0.0.1:8080/yansl/MyHtml.html");
		
		 Thread.sleep(2000);
		 
		 boolean isSuuccess = driver.getPageSource().contains("login");
		 System.out.println(isSuuccess);
		 
		 WebElement userName = driver.findElement(By.id("login"));
		 userName.clear();
		 userName.sendKeys("yan");
		 
		 WebElement password = driver.findElement(By.id("password"));
		 password.clear();
		 password.sendKeys("mima");
		 
		 Thread.sleep(2000);
		 
		 WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		 submit.click();
				 Thread.sleep(2000);
				 
		isSuuccess = driver.getPageSource().contains("get");
		System.out.println(isSuuccess);
	}
		
	
}
