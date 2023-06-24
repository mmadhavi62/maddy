package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import BaseClass.BaseClass_facebook;
import PageObjects.facebookLocators;
import io.cucumber.java.en.And;

public class FacebookStepDefinition extends BaseClass_facebook{

	facebookLocators locators;
	
	@Given("User is on facebook login page") 
	public void user_is_on_facebook_login_page() {
		BaseClass_facebook.launchBrowser();
		locators=new facebookLocators();
		
		
	}
    @When("user enters valid credentials") 
    public void user_enters_valid_credentials() {
    	locators.email();
    	locators.password();
    }
    @And("user clicks on login button") 
    public void user_clicks_on_login_button() {
    	locators.login();
    }
    
    @Then("user is logged in successfully") 
    public void user_is_logged_in_successfully() {
    	System.out.println("User is loggedin successfully");
    }
    
}
