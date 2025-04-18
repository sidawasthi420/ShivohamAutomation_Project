package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class commonSteps {

	/*private static WebDriver driver = hook.driver;        
	
	@Given("^navigate to the url \"([^\"]*)\"$")
	public void navigate_to_the_url(String url) {
	    driver.get(url);
	}


    @Given("the user is on HomePage")
    public void the_user_is_on_home_page() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	String navbarBrand = driver.findElement(By.xpath("(//a[@href='index.html'])[1]")).getText();
        Assert.assertEquals("Company name does not match", "Shivoham Automation", navbarBrand);
    }

	@When("^user clicks on about link$")
	public void user_clicks_on_about_link() {
	    driver.findElement(By.xpath("//a[text()='About']")).click();
	}
*/
}
