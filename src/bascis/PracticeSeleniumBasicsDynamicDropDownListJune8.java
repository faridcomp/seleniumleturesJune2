package bascis;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumBasicsDynamicDropDownListJune8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println("Page Title" + driver.getTitle());
		
		WebElement crm = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div/ul/li[3]/a/p")); 
		crm.click(); 
		Set <String> wh = driver.getWindowHandles(); 
		Iterator <String> iterator = wh.iterator(); 
		String parentWindow = iterator.next(); 
		String childWindow = iterator.next(); 
		System.out.println("Page Title" + driver.getTitle());
		driver.switchTo().window(childWindow); 
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(500); 
		driver.close(); 
		driver.switchTo().window(parentWindow); 
		System.out.println("Page Title: " + driver.getTitle());
	}

}
