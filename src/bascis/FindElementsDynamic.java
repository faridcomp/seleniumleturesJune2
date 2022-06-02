package bascis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDynamic {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe ");
			WebDriver driver = new ChromeDriver (); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
			
			List <WebElement> webLinks = driver.findElements(By.tagName("div"));
			System.out.println("this is the link list  " +  webLinks.size());
			
			for (WebElement links : webLinks) {
				System.out.println(links.getAttribute("class"));
				 
				}
			}
	}


