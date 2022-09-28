package Practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google_img {
private static final String Expectedconditions = null;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.in/");
	 driver.manage().window().maximize();
	 WebDriverWait wait1 = new WebDriverWait (driver,Duration.ofSeconds(15));
	 WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(5000));
	 wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	List<WebElement> img1 = wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("img")));
	System.out.println(img1.size());
	for (WebElement one:img1) {
		System.out.println(one);
	}
	
	TakesScreenshot ts = (TakesScreenshot) driver ;
	ts.getScreenshotAs(OutputType.FILE);
	
	
}

}
