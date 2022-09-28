package TakeScreenshot;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class AmazonRandom {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.in");
	Thread.sleep(3000);
	
	String Ra1 = RandomString.make();
	
	TakesScreenshot ts1= (TakesScreenshot)driver;
	Thread.sleep(3000);
	File src1 = ts1.getScreenshotAs(OutputType.FILE);
	File dest = new File ("C:\\Users\\Suraj\\Desktop\\ScreenShot\\"+Ra1+".jpg");
	
	Files.copy(src1, dest);
	
	
}
}
