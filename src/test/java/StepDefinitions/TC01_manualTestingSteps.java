package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration; 
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_manualTestingSteps {

	private static WebDriver driver = hook.driver;
	
 //   @FindBy(xpath = "//a[text()='Courses']")
 //   private WebElement courses;

    @FindBy(xpath = "//a[text()='Manual Testing']")
    private WebElement manualTesting;
    
    @FindBy(xpath = "//h1[text()='Manual Testing']")
    private WebElement coursesManualTesting;
    
    @FindBy(xpath = "//h5[text()='Online Classes']")
    private WebElement homePageOnlineClasses;
    
 //   @FindBy(xpath = "//a[text()='Enroll Now']")
 /*   @FindBy(xpath = "//a[@class='enrollment-btn']") 
    private WebElement enrollNowButton;
*/
    
    @FindBy(xpath = "//h2[text()='Join Our Course Today!']")
    private WebElement coursesText; 
  
/*    @FindBy(id = "name")
    private WebElement nameField; 
    
    @FindBy(id = "email")
    private WebElement emailField; 
          
    @FindBy(id = "phone")
    private WebElement phoneField; 
    
    @FindBy(id = "course")
    private WebElement courseDropdown; 
    
    @FindBy(id = "date")
    private WebElement dateField;  
    
    @FindBy(id = "registrationButton")
    private WebElement registerNowButton; 
 */
    
    public TC01_manualTestingSteps() {
        PageFactory.initElements(driver, this);
    }
	
/*	@Given("^the user launches the website \"([^\"]*)\"$")
	public void the_user_launches_the_website(String url) {
		driver.get(url);
	}
	
    @Given("^the user is on the Home page$")
    public void the_user_is_on_the_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  

        String companyName = driver.findElement(By.xpath("//div[@class='web-view']/img[1]")).getAttribute("alt");
        Assert.assertEquals(companyName, "Shivoham Automation Expert");
        
//      wait.until(ExpectedConditions.visibilityOf(homePageOnlineClasses)); 

//		Assert.assertEquals(HomePageOnlineClasses.getText(), "Online Classes");
//        Assert.assertTrue(homePageOnlineClasses.isDisplayed(), "User is not on the Home page.");
    }

	@When("^the user clicks on the Courses button$")
	public void the_user_clicks_on_the_Courses_button() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(courses));
		courses.click();
	}
	*/

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
        
//		Assert.assertEquals(coursesManualTesting.getText(), "Manual Testing");
		Assert.assertTrue(coursesManualTesting.isDisplayed(), "Manual Testing heading is not displayed.");
	}
}



/*
	@Then("^the user clicks on the Enroll Now button$")
	public void the_user_clicks_on_the_Enroll_Now_button() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(enrollNowButton));
	    enrollNowButton.click();
	}
*/
	
/*	@Then("^the user clicks on the Enroll Now button$")
	public void the_user_clicks_on_the_Enroll_Now_button() {
	//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//		wait.until(ExpectedConditions.visibilityOf(enrollNowButton));
	//		wait.until(ExpectedConditions.elementToBeClickable(enrollNowButton));

    Actions actions = new Actions(driver);
 //   actions.moveToLocation(30, 0).build().perform();
    actions.moveToElement(enrollNowButton).click().build();
    actions.perform();
 // enrollNowButton.click();

	String href =  enrollNowButton.getAttribute("href");
	System.out.println(href);
	driver.get(href);
	}
	
	@Then("^the user enters Full Name as \"([^\"]*)\"$")
	public void the_user_enters_full_name_as(String fullName) {
	    nameField.clear();
	    nameField.sendKeys(fullName);
	}
	
	@Then("^the user enters Email Address as \"([^\"]*)\"$")
	public void the_user_enters_email_address_as(String email) {
	    emailField.clear();
	    emailField.sendKeys(email);
	}
	
	@Then("^the user enters Phone Number as \"([^\"]*)\"$")
	public void the_user_enters_phone_number_as(String phone) {
		phoneField.clear();
		phoneField.sendKeys(phone);
	}
	
	@Then("^the user selects Course as \"([^\"]*)\"$")
	public void the_user_selects_course_as(String course) {
	    Select select = new Select(courseDropdown);
	    select.selectByVisibleText(course);
	}
	
	@Then("^the user selects Preferred Start Date as \"([^\"]*)\"$")
	public void the_user_selects_preferred_start_date_as(String date) {
	    dateField.clear(); 
	    dateField.sendKeys(date); 
	}
	
	@Then("^the user submits the registration form$")
	public void the_user_submits_the_registration_form() {
		registerNowButton.click();
	}
	
    @Then("^the user should see pop-up with the message \"([^\"]*)\"$")
    public void the_user_should_see__pop_up_with_the_message(String expectedMessage) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Alert message mismatch");
    }

    @Then("^the user accept the alert$")
    public void the_user_accept_the_alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    */
