package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class manualTesting {

	private static WebDriver driver = hook.driver;
	
    @FindBy(xpath = "//a[text()='Courses']")
    private WebElement Courses;

    @FindBy(xpath = "//a[text()='Manual Testing']")
    private WebElement ManualTesting;
    
    @FindBy(xpath = "//h1[text()='Manual Testing']")
    private WebElement CheckManualTesting;
    
    public manualTesting() {
        PageFactory.initElements(driver, this);
    }
	
	@Given("^the user launches the website \"([^\"]*)\"$")
	public void the_user_launches_the_website(String url) {
		driver.get(url);
	}

	@When("^the user clicks on the Courses button$")
	public void the_user_clicks_on_the_Courses_button() {
		Courses.click();
	}

	@When("^the user selects Manual Testing from the dropdown$")
	public void the_user_selects_Manual_Testing_from_the_dropdown() {
		ManualTesting.click();
	}

	@Then("^the Manual Testing course page should be displayed$")
	public void the_Manual_Testing_course_page_should_be_displayed() {
		// You can use an assertion here, depending on your test framework
		Assert.assertEquals(CheckManualTesting.getText(), "Manual Testing");
       
	}
} 
