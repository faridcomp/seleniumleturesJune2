package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicsJune2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS); 
		driver.get("https://learn.canvas.net/login/canvas");
		
		
		System.out.println(driver.getTitle()); 
		WebElement emaild = driver.findElement(By.id("pseudonym_session_unique_id")); 
		emaild.sendKeys("me@tekschool.com"); 
		WebElement passwd = driver.findElement(By.id("pseudonym_session_password")); 
		passwd.sendKeys("wrongpassword"); 
		WebElement rememberme = driver.findElement(By.id("pseudonym_session_remember_me")); 
		rememberme.click(); 
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button")); 
		button.click(); 
//		driver.close(); 

	}

}
