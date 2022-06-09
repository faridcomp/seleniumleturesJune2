package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassJune3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		
		driver.get("http://tek-school.com/retail/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions action = new Actions (driver); 
		action.moveToElement(desktop).build().perform(); 
	}

}
