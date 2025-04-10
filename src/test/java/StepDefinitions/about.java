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
	
	@Then("^the user should get navigated to about page$")
	public void the_user_should_get_navigated_to_about_page() {
		 String expected_about_text = "About Us";
		 String actual_about_text = driver.findElement(By.xpath("//h1[contains(@class,'slideInDown')]")).getText();
		 Assert.assertEquals(actual_about_text, expected_about_text);
	}
}
