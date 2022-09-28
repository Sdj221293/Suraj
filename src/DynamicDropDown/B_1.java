package DynamicDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("KGF");
	Thread.sleep(3000);
	List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	Thread.sleep(3000);
	for ( WebElement one:alloptions) {
		String Text1 = one.getText();
		System.out.println(Text1);
	}
}
}
