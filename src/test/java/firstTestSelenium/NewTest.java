package firstTestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public String exePath = "D:\\Users\\monica\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public String url = "https://google.com";
	// System.setProperty("webdriver.firefox.marionette", exePath);
	// WebDriver driver = new FirefoxDriver();
	public String urlChrome = System.setProperty("webdriver.chrome.driver", exePath);
	public WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to(url);
		System.out.println("Application title is =============" + driver.getTitle());
		// Maximize the browser
		driver.manage().window().maximize();
		System.out.println("success test okeeee!!!"+url);
		
		
		
		
	  
  }
}
