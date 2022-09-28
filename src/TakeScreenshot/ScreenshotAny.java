package TakeScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotAny {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.in");
	Thread.sleep(3000);
	WebElement img = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	
	 File src3 = img.getScreenshotAs(OutputType.FILE);
	 File dest = new File ("C:\\Users\\Suraj\\Desktop\\ScreenShot\\Amazon2.png");
	 
	 Files.copy(src3, dest);
	
}
}
