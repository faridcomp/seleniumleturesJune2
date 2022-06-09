package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassJune2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
		Thread.sleep(5000);
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		Select select = new Select (sortBy); 
		select.selectByVisibleText("Model (A - Z)"); 
		
//		driver.close();
	}

}
