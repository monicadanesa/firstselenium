package searchGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchPage {
	WebDriver driver;

	By keyWordGoogle = By.xpath(".//*[@id='lst-ib']");
	//By button = By.xpath(".//*[@id='sblsbb']/button");

	public searchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setKeyWord(String KeyWord) {
		driver.findElement(keyWordGoogle).sendKeys(KeyWord);
	}

	//public void clickButton() {
		//driver.findElement(button).click();
	//}

	public void sendKeyWordGoogle(String KeyWord) {
		this.setKeyWord(KeyWord);
		//this.clickButton();
	}
}
