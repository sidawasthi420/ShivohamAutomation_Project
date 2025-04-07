package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class about {

	private static WebDriver driver = hook.driver;
	
	@Given("^navigate to the url \"([^\"]*)\"$")
	public void navigate_to_the_url(String url) {
	    driver.get(url);
	}

	@Then("^validate that user is on home page$")
	public void validate_that_user_is_on_home_page() {
	    String companyName = driver.findElement(By.xpath("//a[@class='navbar-brand']/div/span[1]")).getText();
	    Assert.assertEquals(companyName, "Shivoham Automation");
	}

	@When("^user clicks on about link$")
	public void user_clicks_on_about_link() {
	    driver.findElement(By.xpath("//a[text()='About']")).click();
	}

	@Then("^the user should get navigated to about page$")
	public void the_user_should_get_navigated_to_about_page() {
		 String expected_about_text = "About Us";
		 String actual_about_text = driver.findElement(By.xpath("//h1[contains(@class,'slideInDown')]")).getText();
		 Assert.assertEquals(actual_about_text, expected_about_text);
	}
}
