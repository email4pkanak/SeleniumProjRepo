package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside given block");
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside when block");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside And block");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("inside then block");
		// Write code here that turns the phrase above into concrete actions
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
