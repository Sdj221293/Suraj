package Act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Google.in");
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.xpath("//a[text()='Gmail']"));
	Thread.sleep(3000);
	Actions act1= new Actions(driver);
	act1.moveToElement(ele1).click().perform();
	driver.get(driver.getCurrentUrl());
	
	
}
}
