package Practice1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class google1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.in/");
		 driver.manage().window().maximize();
		List<WebElement> img12 = driver.findElements(By.tagName("img"));
		
		for (WebElement one:img12) {
			boolean img = one.isDisplayed();
			System.out.println(img);
		}
		
	}

}
