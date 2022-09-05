package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundColorStepDefinition extends TestBase{
	
	HomePage homePageObj;
	
	
	@Before
	public void setUp() {
		initDriver();
		homePageObj = PageFactory.initElements(driver, HomePage.class);	
	}
	
	@Given("Set SkyBlue Background button exists")
	public void set_sky_blue_background_button_exists() {
		driver.get(" http://techfios.com/test/101/");
		Assert.assertTrue(homePageObj.checkSkyblueButton());
	}
	@When("I click on the skyblue button")
	public void i_click_on_the_skyblue_button() {
		homePageObj.clickSkyblueButton();
	}
	@Then("the background color will change to skyblue")
	public void the_background_color_will_change_to_skyblue() {
	   Assert.assertTrue(driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).isEnabled());
	}
	
	@Given("Set White Background button exists")
	public void set_White_background_button_exists() {
		driver.get(" http://techfios.com/test/101/");
		Assert.assertTrue(homePageObj.checkWhiteButton());
	}
	@When("I click on the White button")
	public void i_click_on_the_White_button() {
		homePageObj.clickWhiteButton();;
	}
	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
	   Assert.assertTrue(driver.findElement(By.xpath("//body[@style='background-color: white;']")).isEnabled());
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
