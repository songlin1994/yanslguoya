package testindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "c:/software/chromedriver");
			WebDriver driver = new ChromeDriver();
			 Thread.sleep(3000);
		  driver.get("www.baidu.com");
		  
		  Thread.sleep(3000);
		  
//		  boolean result = driver.getPageSource().contains("百度百科");
//		  System.out.println(result);
		  
		  WebElement select = driver.findElement(By.xpath("//input[@id='kw']"));
		  select.sendKeys("果芽软件");
		  
		  Thread.sleep(3000);
		  
		 WebElement cli = driver.findElement(By.xpath("//input[@id='su']"));
		 cli.click();
		
		Boolean  jieguo = driver.getPageSource().contains("吴令");
		 
		 System.out.println(jieguo);
		 
		 driver.quit();
		 
		 
		}
}
