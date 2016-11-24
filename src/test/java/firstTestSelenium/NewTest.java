package firstTestSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class NewTest {
	
	public String exePath;
	public String setDriver;
	// System.setProperty("webdriver.firefox.marionette", exePath);
	// WebDriver driver = new FirefoxDriver();
	WebDriver driver;


  @Parameters ({"BROWSER"})
  @BeforeMethod
  public void testBrowser(String BROWSER)throws Exception{
	 
	 if(BROWSER.equalsIgnoreCase("FF"))
	  {	//exePath = "D:\\Users\\monica\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe";
		// exePath ="/var/lib/jenkins/workspace/seleniumtest/geckodriver.exe";
		 //System.setProperty("webdriver.firefox.bin", exePath);
		// System.setProperty("webdriver.firefox.marionette",exePath);        
		 driver = new FirefoxDriver();
		 System.out.println("FF");
	  }
	  else if (BROWSER.equalsIgnoreCase("CH"))
	  {
		  //exePath = "D:\\Users\\monica\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  //exePath ="/var/lib/jenkins/workspace/seleniumtest/chromedriver.exe";
		  //setDriver = System.setProperty("webdriver.chrome.driver", exePath);
		  driver = new ChromeDriver();
		  System.out.println("CH");
	  }
	 
	 
	else if(BROWSER.equalsIgnoreCase("IE")){

          //set path to IEdriver.exe You may need to download it from

   // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip

   // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip

          System.setProperty("webdriver.ie.driver","D:\\Users\\monica\\Downloads\\IEDriverServer_x64_2.42.0\\IEdriver.exe");
     
          //create chrome instance

         driver = new InternetExplorerDriver();
		System.out.println("IE");
      }
	  
	  else{
		  throw new Exception("Browser is not correct");
	  }
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://google.com");
  }
  
  
	
  @Test
  public void f()  throws InterruptedException {
	 
		// Launch website
		System.out.println("Application title is =============" + driver.getTitle());
		// Maximize the browser
		driver.manage().window().maximize();
		System.out.println("success test okeeee!!!");
	  
  }

}
