package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pages_OurTeam {
	private static WebDriver driver = hook.driver;

	public pages_OurTeam() {

		PageFactory.initElements(driver, this);
		// this.driver = driver;
	}

	@FindBy(xpath = "//h5[text()='Online Classes']")
	WebElement VerifyHomepage;
	@FindBy(xpath = "//a[text()='Pages']")
	WebElement Pages;
	@FindBy(linkText=("Our Team"))
			WebElement OurTeam;
	@FindBy(xpath = "//h1[text()='Our Team']")
	WebElement VerifyOurTeampage;
	
	@Given("^User enter URL to navigate the website \"([^\"]*)\"$")
	public void user_enter_url_to_navigate_the_website(String Url) {

		driver.get(Url);

	}

	@Given("Validating the user is on the home page")
	public void validating_the_user_is_on_the_home_page() {
		Actions action = new Actions(driver);
		action.moveToElement(VerifyHomepage).perform();
		Assert.assertEquals(VerifyHomepage.getText(), "Online Classes");
	}

	@When("^User clicks on Pages button$")
	public void user_clicks_on_pages_button() {
		Pages.click();
	}

	@When("^User clicks on Our Team button$")
	public void user_clicks_on_our_team_button() {
		OurTeam.click();
	}

	@Then("^Validating user successfully navigating Our Team Page$")
	public void validating_user_successfully_navigating_our_team_page() {
		Assert.assertEquals(VerifyOurTeampage.getText(), "Our Team");
	
		}
		
	}


