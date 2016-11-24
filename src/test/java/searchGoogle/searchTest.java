package searchGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import searchGoogle.searchPage;


public class searchTest{
	WebDriver driver;
	searchPage objPage;
	String exePath;
	
	@Parameters({"BROWSER"})
	@BeforeTest
	public void setUp(String BROWSER) {

		 if (BROWSER.equalsIgnoreCase("CH"))
		  {
			  exePath = "D:\\Users\\monica\\Downloads\\chromedriver_win32_latest\\chromedriver.exe";
			  //exePath ="/usr/bin/chromedriver";
			  System.setProperty("webdriver.chrome.driver", exePath);
			  driver = new ChromeDriver();
			  System.out.println("CH");
			  
		  }
		 
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	}

	@Test
	public void f() {
		objPage = new searchPage(driver);
		objPage.sendKeyWordGoogle("apple");
	}
}
