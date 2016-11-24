package searchGoogle;

import searchGoogle.searchPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BasePage {
	
WebDriver driver;
private String exePath;

@Parameters({"BROWSER"})

public void setUp(String BROWSER){
	 
	 if (BROWSER.equalsIgnoreCase("CH"))
	  {
		  exePath = "D:\\Users\\monica\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", exePath);
		  driver = new ChromeDriver();
		  System.out.println("CH");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://google.com");
			driver.manage().window().maximize();
	  }
	 
}
}
