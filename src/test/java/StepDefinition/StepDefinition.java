package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.AddToCartClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition{
	
	AddToCartClass addtocart;
	
	@Given("User is on ebay homepage")
	public void user_is_on_ebay_homepage() {
	    BaseClass.launchBrowser();
		addtocart=new AddToCartClass();
	
		
	}
	
	

	
	/*
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
		addtocart.SignIn();
	}
	
	
    @And("enters valid username and password")
    public void enters_valid_username_and_password() {
    	addtocart.credentials(prop.getProperty("username"),prop.getProperty("password"));
    }

*/	
	
	@Then("user logged in and selects Cell phones from Categories")
	public void user_selects_cell_phones_from_categories() {
	 addtocart.CellPhones();   
	}
	
	@And("selects brand Apple")
	public void selects_brand_apple() {
	    addtocart.SelectApple();
	}
	
	
	@And("selects any iphone")
	public void selects_any_iphone() {
	    addtocart.SelectIphone();
	}
	
	@Then("validate the text")
	public void validate_the_text() {
		BaseClass.tearDown();
	}
	
	
}
