package testindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "c:/software/chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			 Thread.sleep(3000);
		  driver1.get("http://www.baidu.com");
		  
		  Thread.sleep(3000);
		  
//		  boolean result = driver.getPageSource().contains("百度百科");
//		  System.out.println(result);
		  
		  WebElement select = driver1.findElement(By.xpath("//input[@id='kw']"));
		  select.sendKeys("果芽软件");
		  
		  Thread.sleep(3000);
		  
		 WebElement cli = driver1.findElement(By.xpath("//input[@id='su']"));
		 cli.click();
		
		Boolean  jieguo = driver1.getPageSource().contains("吴令");
		 
		 System.out.println(jieguo);
		 
		 driver1.quit();
		 
		 
		}
}
