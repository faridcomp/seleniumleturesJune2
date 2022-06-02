package bascis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicandStaticDropDownsAirport {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
		driver.get("https://www.aa.com/");
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		from.clear(); 
		from.sendKeys("wash"); 
		List <WebElement> depart = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a")); 
		for (WebElement departure : depart) {
			if(departure.getText().contains("DCA")) {
				departure.click(); 
				break; 
			}
		}

	}

}
