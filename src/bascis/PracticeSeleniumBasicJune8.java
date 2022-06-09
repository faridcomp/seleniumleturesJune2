package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeSeleniumBasicJune8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , ".\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		
		driver.get("http://tek-school.com/retail/"); 
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions action = new Actions (driver); 
		action.moveToElement(desktop).build().perform(); 
		
		WebElement showAllDesktops = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		showAllDesktops.click(); 
		WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort']")); 
		Select select = new Select (sortBy); 
		select.selectByVisibleText("Model (A - Z)"); 
		WebElement iphone = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]")); 
		iphone.click(); 
	}

}
