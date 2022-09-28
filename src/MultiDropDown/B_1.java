package MultiDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Suraj/Desktop/MultiSelect.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement alloptions2 = driver.findElement(By.xpath("//select[@id='PARADISE']"));
	
	Select s = new Select(alloptions2) ;
		
		List<WebElement> one_ele = s.getOptions();
		System.out.println(one_ele.size());
		///System.out.println(one_ele);
		
		
		for (WebElement ele:one_ele) {
			String Text2 = ele.getText();
			System.out.println(Text2);
			
		}
	
	
	
}
}
