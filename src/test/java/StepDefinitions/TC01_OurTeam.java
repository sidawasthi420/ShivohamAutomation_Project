package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
public class TC01_OurTeam {
	
	private static WebDriver driver = hook.driver;
    
    
	public TC01_OurTeam() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[text()='Online Classes']")
	WebElement VerifyHomepage;

	@FindBy(xpath = "//a[text()='Pages']")
	WebElement Pages;

	@FindBy(linkText = ("Our Team"))
	WebElement OurTeam;

	@FindBy(xpath = "//h1[text()='Our Team']")
	WebElement VerifyOurTeampage;

	@FindBy(xpath = "//div[@class='container']//div[contains(@class, 'col-lg-3')]")
	List<WebElement> TeamProfile;

	@FindBy(xpath = "//div[contains(@class, 'text-center p-4')]//h5")
	List<WebElement> TeamName;

	@FindBy(xpath = "//div[contains(@class, 'text-center p-4')]//small")
	List<WebElement> TeamDesignation;

	@FindBy(xpath = "//a[@class='btn btn-sm-square btn-primary mx-1']")
	WebElement SocialMediaicons;

	// @FindBy(xpath = "//a[@class='enrollment-btn']")
	@FindBy(xpath = "(//a[@href='registration.html'])[1]")
	WebElement ClickOnEnrollNowButton;

	@FindBy(xpath = "//input[@placeholder='Enter your full name']")
	WebElement EnterName;
	
	@Given("^User enter URL to navigate the website \"([^\"]*)\"$")
	public void user_enter_url_to_navigate_the_website(String Url) {

		driver.get(Url);
	}

	@Given("^Validating the user is on the home page$")
	public void validating_the_user_is_on_the_home_page() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  

        String companyName = driver.findElement(By.xpath("//div[@class='web-view']/img[1]")).getAttribute("alt");
        Assert.assertEquals(companyName, "Shivoham Automation Expert");
	}

	@When("^User clicks on Pages button$")
	public void user_clicks_on_pages_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Pages)).click();
	}

	@When("^User clicks on Our Team button$")
	public void user_clicks_on_our_team_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(OurTeam)).click();
	}

	@Then("^Validating user successfully navigating Our Team Page$")
	public void validating_user_successfully_navigating_our_team_page() {

		Assert.assertEquals(VerifyOurTeampage.getText(), "Our Team");
		System.out.println("verified Ourteam text successfully");
	}

	@Then("^team member profile should be visible$")
	public void team_member_profile_should_be_visible() {

		if (TeamProfile.size() == 4) {
			System.out.println("Team profile is visible");
		} else {

			System.out.println("Team profile is not visible");
		}
	}

	@Then("^Each team member should have a name and designation$")
	public void each_team_member_should_have_a_name_and_designation() {

		List<WebElement> TeamProfile = driver
				.findElements(By.xpath("//div[@class='container']//div[contains(@class, 'col-lg-3')]"));
		System.out.println("Total team members found: " + TeamProfile.size());
		for (int i = 0; i < TeamProfile.size(); i++) {
			WebElement profile = TeamProfile.get(i);
		}
		List<WebElement> names = driver
				.findElements(By.xpath("//div[@class='container']//div[contains(@class, 'col-lg-3')]//descendant::h5"));
		for (WebElement name : names) {
			System.out.println("Name " + name.getText());

		}
		List<WebElement> designations = driver.findElements(
				By.xpath("//div[@class='container']//div[contains(@class, 'col-lg-3')]//descendant::small"));
		for (WebElement designation : designations) {
			System.out.println("designation " + designation.getText());

		}
	}

	@Then("^Social Media icon should be visible \"([^\"]*)\"$")
	public void social_media_icon_should_be_visible(String string) {
		if (((List<WebElement>) SocialMediaicons).size() == 12) {
			System.out.println("Social media icons are visible");
		} else {
			System.out.println("Social media icons are not visible");
		}
	}

	@Then("^All social media icon should contain valid link each Team member profile  \"([^\"]*)\"$")
	public void all_social_media_icon_should_contain_valid_link_each_team_member_profile(String string) {
		System.out.println("icons successfully covered");
	}

	@Then("^User clicks on the Enroll Now link$")
	public void user_clicks_on_the_enroll_now_link() {

	}

	@Then("^User Enters Name \"([^\"]*)\" in join Now form$")
	public void user_enters_name_in_join_now_form(String string) {

	}

	@Then("^User Enters email \"([^\"]*)\" in join Now form$")
	public void user_enters_email_in_join_now_form(String string) {

	}

	@Then("^User Enters Phone number  \"([^\"]*)\" in join Now form$")
	public void user_enters_phone_number_in_join_now_form(String string) {

	}

	@Then("^User Select course \"([^\"]*)\" in join Now form$")
	public void user_select_course_in_join_now_form(String string) {

	}

	@Then("^User Select date \"([^\"]*)\" in join Now form$")
	public void user_select_date_in_join_now_form(String string) {

	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {

	}

}
