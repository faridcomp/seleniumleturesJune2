package bascis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPracticeJune3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20&sort=p.model&order=DESC");
		Thread.sleep(1000); 
		
		WebElement sortNumber = driver.findElement(By.id("input-limit")); 
		Select select = new Select(sortNumber); 
		select.selectByVisibleText("100"); 
		
//		List <WebElement> tagDiv = driver.findElements(By.tagName("div")); 
//		System.out.println("Size: " + tagDiv.size());
//		for (WebElement divd: tagDiv) {
//			System.out.println(divd.getText());
//		}
//		WebElement sortBy = driver.findElement(By.id("input-sort")); 
//		Select select = new Select(sortBy); 
//		select.selectByVisibleText("Rating (Lowest)"); 
//		Thread.sleep(3000); 
//		WebElement sortBy2 = driver.findElement(By.id("input-sort")); 
//		Select select2 = new Select(sortBy2);
//		select2.selectByVisibleText("Name (Z - A)"); 
//		List <WebElement> weblinks = driver.findElements(By.tagName("a")); 
//		System.out.println("Size: " + weblinks.size());
//		for (WebElement links: weblinks) {
//			System.out.println(links.getAttribute("href"));
//		}
		
		
		
	}

}
