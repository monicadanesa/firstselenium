package searchGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import searchGoogle.searchPage;
import searchGoogle.BasePage;

public class searchTest extends BasePage{
	WebDriver driver;
	searchPage objPage;

	@Parameters({"BROWSER"})
	@BeforeTest
	public void setUp(String BROWSER) {
		BasePage bp = new BasePage();
		bp.setUp(BROWSER);
		
	}

	@Test
	public void f() {
		objPage = new searchPage(driver);
		objPage.sendKeyWordGoogle("apple");
	}
}
