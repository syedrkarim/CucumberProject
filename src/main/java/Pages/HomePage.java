package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//button[@onclick='myFunctionSky()']")
	WebElement skyblueButton;
	
	@FindBy(xpath = "//button[@onclick='myFunctionWhite()']")
	WebElement whiteButton;
	
	
	public boolean checkSkyblueButton() {
		return skyblueButton.isEnabled();
	}
	
	public boolean checkWhiteButton() {
		return whiteButton.isEnabled();
	}

	public void clickSkyblueButton() {
		skyblueButton.click();
	}
	
	public void clickWhiteButton() {
		whiteButton.click();
	}
	
	
	
	
	

}
