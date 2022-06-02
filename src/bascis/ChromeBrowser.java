package bascis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver ();
//		driver.get("https://tekschool.us/");
//		driver.close(); 
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver (); 
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close(); 

	}

}
