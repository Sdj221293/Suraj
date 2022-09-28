package Act;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.in");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	act.moveToElement(ele).click().build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(3000);
	Point location = driver.findElement(By.xpath("//a[@aria-label='OP 9 pro']")).getLocation();
	System.out.println(location);
	
}
}
