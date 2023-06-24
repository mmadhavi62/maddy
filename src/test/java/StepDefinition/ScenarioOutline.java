package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_name(String name) {
	    System.out.println(name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	   System.out.println(int1);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_success_in_step(String success) {
		System.out.println(success);
	}
	
}
