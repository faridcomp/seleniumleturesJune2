package bascis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.navigate().to("https://www.youtube.com/watch?v=03XcLHWaqLU");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().to("https://canvas.instructure.com/login/canvas");
		
		WebElement email = driver.findElement(By.name("pseudonym_session[unique_id]"));
		
		email.sendKeys("info@yahoo.net");
		WebElement pass = driver.findElement(By.name("pseudonym_session[password]"));
		pass.sendKeys("34567");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		login.click();
//		driver.navigate().forward();
		Thread.sleep(5000);
//		driver.navigate().back();
//		driver.quit();
		

	}

}
