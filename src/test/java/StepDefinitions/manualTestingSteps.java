package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class manualTestingSteps {

	private static WebDriver driver = hook.driver;

	@FindBy(xpath = "//a[text()='Manual Testing']")
	private WebElement manualTesting;

	@FindBy(xpath = "//h1[text()='Manual Testing']")
	private WebElement coursesManualTesting;

	@FindBy(xpath = "//h5[text()='Online Classes']")
	private WebElement homePageOnlineClasses;

	@FindBy(xpath = "//h2[text()='Join Our Course Today!']")
	private WebElement coursesText;

	public manualTestingSteps() {
		PageFactory.initElements(driver, this);
	}

	@When("^the user selects Manual Testing from the dropdown$")
	public void the_user_selects_Manual_Testing_from_the_dropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(manualTesting));
		manualTesting.click();
	}

	@Then("^the Manual Testing course page should be displayed$")
	public void the_Manual_Testing_course_page_should_be_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(coursesManualTesting));
		Assert.assertTrue(coursesManualTesting.isDisplayed(), "Manual Testing heading is not displayed.");
	}
}
