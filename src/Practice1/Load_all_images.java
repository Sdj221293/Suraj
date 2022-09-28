package Practice1;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Load_all_images {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			  List<WebElement> allLinkElements = driver.findElements(By.tagName("img"));
			  
			  int linkListCount=allLinkElements.size();
			  System.out.println("No of Images : "+ linkListCount);
			  
			  for(int i=0;i<linkListCount;i=i+1) {
				  System.out.println("Link :"+i+"  "+allLinkElements.get(i).getAttribute("src"));
			  }
		}

	}


