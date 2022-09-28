package DynamicElementHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart_Review {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles Under 10000",Keys.ENTER);
	Thread.sleep(3000);
	String Review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
	
	System.out.println(Review);
	
	
	
	
}
}
