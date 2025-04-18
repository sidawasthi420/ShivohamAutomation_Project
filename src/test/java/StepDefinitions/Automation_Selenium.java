package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;


public class Automation_Selenium {

	private static WebDriver driver = hook.driver;
	
	
	
	@FindBy(xpath="(//a[@href='index.html'])[1]")
	public WebElement Homepage;
   
    @FindBy(xpath="//a[@class='nav-link dropdown-toggle' and contains(text(),'Courses')]")
	public WebElement course;
   

	@FindBy(xpath="(//a[@href='#'])[1]")
	public WebElement Automation_testing;
	
	@FindBy(xpath="//a[@href='selenium.html']")
	public WebElement Seleniun;
	
	@FindBy(xpath="//h1[@class='display-3 text-white animated slideInDown']")
	public WebElement Selenium_Automation_Testing;
	
	@FindBy(xpath="//a[@href='registration.html?course=selenium']")
	public WebElement Enrollnow;
  
	//@FindBy(xpath="//input[@id='name']")
	//public WebElement Name;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement Name;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement Email_Address;
	
	@FindBy(xpath="//input[@id='phone']")
	public WebElement phone;
	
	@FindBy(xpath="//input[@id='course']")
	public WebElement course_name;
	
	@FindBy(xpath="//input[@id='date']")
	public WebElement date;
	
	@FindBy(xpath="//button[@id='registrationButton']")
	public WebElement Registernow;
	
	public Automation_Selenium()
	{
		PageFactory.initElements(driver, this);
		
	}
    
	@Given("^navigate to the url \"([^\"]*)\"$")
	public void navigate_to_the_url(String url) {
	    driver.get(url);
	}
	 @When("^User click on Courses section$")
	    public void user_click_on_courses_section() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.elementToBeClickable(course)).click();
	        
	    }
	 @Then("^user select on Automation section from dropdown$")
	    public void user_select_on_automation_section_from_dropdown() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.elementToBeClickable(Automation_testing)).click();
	    }
	 @When("^user click on Selenium$")
	    public void user_click_on_selenium() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.elementToBeClickable(Seleniun)).click();
	    	
	 }

    @Then("^user is on Selenium Automation Testing page is displayed.$")
    public void user_is_on_selenium_automation_testing_page_is_displayed() {
    	boolean Selenium_Automation_Testing  = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
    	Assert.assertTrue(Selenium_Automation_Testing);
    }

    @Then("^user scroll down and click Enroll now button$")
    public void user_scroll_down_and_click_enroll_now_button() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Enrollnow));
    	(Enrollnow).click();
    }
     @Then("^the user enter the \"([^\"]*)\"$")
      public void the_user_enter_the(String fullName) {
    	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Name.clear();
        Name.sendKeys(fullName);
    }

     @Then("^the user enter email \"([^\"]*)\"$")
     public void the_user_enter_email(String email)  {
     //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // wait.until(ExpectedConditions.elementToBeClickable(Email_Address));
         Email_Address.clear();
        Email_Address.sendKeys(email);
       
     }

     @Then("^the user enter phone number \"([^\"]*)\"$")
     public void the_user_enter_phone(String phonenumber) {
    	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        phone.clear(); 
         phone.sendKeys(phonenumber);
         
     }

     @Then("^the user enter course name \"([^\"]*)\"$")
     public void the_user_enter_course(String course) {
    	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     	Select select = new Select(course_name);
         select.selectByVisibleText(course);
         
     }

     @Then("^the user enter start date \"([^\"]*)\"$")
     public void the_user_enter_date(String start_date) {
         date.clear();
         date.sendKeys(start_date);
     }

     @Then("^the user click on Register now$")
     public void the_user_click_on_register_now() {
     	Registernow.click();
     }

   
   

    
   }
