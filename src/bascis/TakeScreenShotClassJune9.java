package bascis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotClassJune9 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println("Page Title" + driver.getTitle());
		takeScreenShot(driver, "firstName"); 
		

		
		
		
	}
	public static void takeScreenShot (WebDriver driver, String fileName) throws IOException {
		String path = ".\\Outcome\\"; 
		File file = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE); 
		FileUtils.copyFile(file, new File (path+fileName+".png"));
		
		
	}

}
