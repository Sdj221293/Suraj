package MultiDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Suraj/Desktop/MultiSelect.html");
	Thread.sleep(3000);
	WebElement Element = driver.findElement(By.xpath("//select[@id='PARADISE']"));
	Thread.sleep(3000);
	
	Select s = new Select(Element);
	if(s.isMultiple()) {
		System.out.println("DropDown is Multiselectable");
	}
	else {
		System.out.println("DropDown is not multiselectable");
	}
	
	List<WebElement> alloptions = s.getOptions();
	
	System.out.println(alloptions.size());
	
	
	
	for (int i = 0 ; i<=alloptions.size()-1 ; i++) {
		WebElement oneoptions = alloptions.get(i);
		String Text3 = oneoptions.getText();
		System.out.println(Text3);
	}
	
}
}
