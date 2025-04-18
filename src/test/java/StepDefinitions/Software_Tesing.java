package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;


public class Software_Tesing {

	private static WebDriver driver = hook.driver;
	
	public Software_Tesing()
	{
		PageFactory.initElements(driver, this);
		
	}
   
    @FindBy(xpath="//a[@class='nav-link dropdown-toggle' and contains(text(),'Courses')]")
	public WebElement course;
   
	@FindBy(xpath="(//a[text()='Complete Software Testing'])")
	public WebElement Complete_Software_Testing;
	
	@FindBy(xpath="(//h1[normalize-space(text())='Complete Software Testing'])")
	public WebElement verify_logo_Complete_Software_Testing;

    @When("^user clicks on course link$")
   public void user_clicks_on_course_link() throws InterruptedException {
    course.click();
    Thread.sleep(5000);
}
    
    //@Given("user navigate to the url {string}")
   // public void navigate_to_the_url(String url) throws InterruptedException {
       // System.out.println("Navigating to URL: " + url);
       // driver.get(url);
       // Thread.sleep(2000);
    //}

    

   @When("^user navigate on Complete Software Testing$")
   public void user_navigate_on_complete_software_testing() {
	  Complete_Software_Testing.click();
	  }
   @Then("^validate that user sucessesful navigate on Complete Software Testing section$")
   public void validate_that_user_sucessesful_navigate_on_complete_software_testing_section() {
       String logo = verify_logo_Complete_Software_Testing.getText();
       Assert.assertEquals( logo, "Complete Software Testing");
   }
   }
