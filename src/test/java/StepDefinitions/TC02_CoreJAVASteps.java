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
import io.cucumber.java.en.When;

public class TC02_CoreJAVASteps {

	private static WebDriver driver = hook.driver;

	
    @FindBy(xpath = "//a[text()='Core JAVA']")
    private WebElement CoreJAVA;
    
    @FindBy(xpath = "//h1[text()='Core JAVA']")
    private WebElement coursesCoreJAVA;
	
	
	
	public TC02_CoreJAVASteps() {
		PageFactory.initElements(driver, this);
	}
	
	
	@When("^the user selects Core JAVA from the dropdown$")
	public void the_user_selects_Core_JAVA_from_the_dropdown() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(CoreJAVA));
	    CoreJAVA.click();
	}

	@Then("^the Core JAVA course page should be displayed$")
	public void the_Core_JAVA_course_page_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
        wait.until(ExpectedConditions.visibilityOf(coursesCoreJAVA));
        
//		Assert.assertEquals(coursesCoreJAVA.getText(), "Core JAVA");
		Assert.assertTrue(coursesCoreJAVA.isDisplayed(), "Core JAVA heading is not displayed.");
	}
}
