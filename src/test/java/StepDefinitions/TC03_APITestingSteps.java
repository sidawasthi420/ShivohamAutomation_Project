package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Then;

public class TC03_APITestingSteps {

	private static WebDriver driver = hook.driver;

	
    @FindBy(xpath = "//a[text()='API Testing']")
    private WebElement APITesting;

	@FindBy(xpath = "//a[text()='API Testing - soapUI']")
	private WebElement soapUI;

	@FindBy(xpath = "//a[text()='API Testing - postman']")
	private WebElement postman;

	@FindBy(xpath = "//a[text()='API Automation - restAssured']")
	private WebElement restAssured;
	
    @FindBy(xpath = "//h1[text()='SoapUI API Testing']")
    private WebElement coursesSoapUIAPITesting;
    
    @FindBy(xpath = "//h1[text()='Postman API Testing']")
    private WebElement coursesPostmanAPITesting;
    
    @FindBy(xpath = "//h1[text()='RestAssured - API Testing']")
    private WebElement coursesRestAssuredAPITesting;
	
	public TC03_APITestingSteps() {
		PageFactory.initElements(driver, this);
	}
		
	@Then("^the user selects API Testing from the dropdown$")
	public void the_user_selects_api_testing_from_the_dropdown() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(APITesting));
	    APITesting.click();
	}

	@Then("^the user selects \"([^\"]*)\" from the sub-dropdown$")
	public void the_user_selects_sub_course_from_the_sub_dropdown(String subCourse) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    if (subCourse.equalsIgnoreCase("API Testing - soapUI")) {
	        wait.until(ExpectedConditions.elementToBeClickable(soapUI));
	        soapUI.click();
	    } else if (subCourse.equalsIgnoreCase("API Testing - postman")) {
	        wait.until(ExpectedConditions.elementToBeClickable(postman));
	        postman.click();
	    } else if (subCourse.equalsIgnoreCase("API Automation - restAssured")) {
	        wait.until(ExpectedConditions.elementToBeClickable(restAssured));
	        restAssured.click();
	    } 
	}

	
	@Then("^the API Testing course page should be displayed$")
	public void the_api_testing_course_page_should_be_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (isElementPresent(coursesSoapUIAPITesting)) {
			wait.until(ExpectedConditions.visibilityOf(coursesSoapUIAPITesting));
			Assert.assertTrue(coursesSoapUIAPITesting.isDisplayed(), "soapUI course page not displayed");
		} else if (isElementPresent(coursesPostmanAPITesting)) {
			wait.until(ExpectedConditions.visibilityOf(coursesPostmanAPITesting));
			Assert.assertTrue(coursesPostmanAPITesting.isDisplayed(), "postman course page not displayed");
		} else if (isElementPresent(coursesRestAssuredAPITesting)) {
			wait.until(ExpectedConditions.visibilityOf(coursesRestAssuredAPITesting));
			Assert.assertTrue(coursesRestAssuredAPITesting.isDisplayed(), "restAssured course page not displayed");
		} 
	}

	private boolean isElementPresent(WebElement element) {
		// TODO Auto-generated method stub
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	

}