package bascis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsJune2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://tek-school.com/retail/");
		driver.getTitle(); 
		List<WebElement> weblinks = driver.findElements(By.tagName("a")); 
		System.out.println("Size:  " + weblinks.size());
		for (WebElement links:weblinks) {
			System.out.println(links.getText() + " : " + links.getAttribute("href"));
			if (links.getText().equals("My Account")) {
				System.out.println("Found it: " + links.getText());
				break; 
			}
		}
		
			 
		 
		driver.close(); 

	}
	
}
