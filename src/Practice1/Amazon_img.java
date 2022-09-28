package Practice1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Amazon_img {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 List<WebElement> imge = driver.findElements(By.tagName("img"));
		 System.out.println(imge.size());
		for ( WebElement one:imge) {
		String display = one.getTagName();
	     System.out.println(display);
	     
	     String Ra1 = RandomString.make();
		
			
		 File src3 = one.getScreenshotAs(OutputType.FILE);
		 File dest = new File ("C:\\Users\\Suraj\\Desktop\\Google\\"+Ra1+".png");
		 
		 Files.copy(src3, dest);
		 	

}
	}
}
