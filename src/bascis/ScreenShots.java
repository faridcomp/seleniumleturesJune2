package bascis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
		takeScreenShot(driver, "firstNameSS"); 
		
	}
		
		public static void takeScreenShot (WebDriver driver, String fileName) {
			
			String path = ".\\Outcome\\"; 
		File file = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE); 
		
		try {
			FileUtils.copyFile(file, new File (path+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		}

}



