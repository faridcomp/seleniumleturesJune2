package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccountMe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver (); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
//		Thread.sleep(5000);
		driver.get("http://tek-school.com/retail/");   
		driver.manage().window().maximize();
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")); 
		System.out.println( myAccount.isDisplayed());
		myAccount.click(); 
		WebElement register = driver.findElement(By.xpath(" //a[text()='Register']")); 
		register.click(); 
		
		WebElement firstname = driver.findElement(By.xpath(" //input[@name='firstname']")); 
		WebElement lastname = driver.findElement(By.xpath(" //input[@name='lastname']")); 
		WebElement email = driver.findElement(By.xpath(" //input[@name='email']")); 
		WebElement phone = driver.findElement(By.xpath(" //input[@name='telephone']")); 
		WebElement passW = driver.findElement(By.xpath(" //input[@id='input-password']")); 
		WebElement passConf = driver.findElement(By.xpath(" //input[@id='input-confirm']")); 
		WebElement newsLetter = driver.findElement(By.xpath(" //input[@value='1' and @name='newsletter']")); 
		WebElement policy = driver.findElement(By.xpath(" //input[@name='agree']")); 
		WebElement continueBut = driver.findElement(By.xpath("//input[@type='submit']" )); 
		
		firstname.sendKeys("Jamesme"); 
		lastname.sendKeys("Bondme");
		email.sendKeys("jamesme22@tekschoo.us"); 
		phone.sendKeys("223344456666"); 
		passW.sendKeys("James2334400"); 
		passConf.sendKeys("James2334400"); 
		if (!newsLetter.isSelected()) {
			newsLetter.click(); 
		}
		if (policy.isDisplayed() ) {
			policy.click(); 
		}
		 continueBut.click(); 
		
//		driver.close(); 

	}

}
