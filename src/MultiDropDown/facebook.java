package MultiDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
	Thread.sleep(3000);
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(3000);
	Select s1 = new Select(months);
	Select s = new Select(element);
	
	List<WebElement> months2 = s1.getOptions();
	s1.selectByIndex(1);
	
	List<WebElement> days = s.getOptions();
	int size1 = days.size();
	s.selectByIndex(30);
	
	
}
}
