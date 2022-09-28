package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,2500);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-500);");
}
}
