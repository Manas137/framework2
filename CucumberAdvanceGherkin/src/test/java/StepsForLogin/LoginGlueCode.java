package StepsForLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginGlueCode {
	
	// Glue Code
	
		@Given("User is on login page")
		public void user_is_on_login_page() {
			System.out.println("Inside Given");
		}

		@When("User enters username and password")
		public void user_enters_username_and_password() {
			System.out.println("Inside When");
		}
		
		@When("Click on login button")
		public void click_on_login_button() {
		    System.out.println("Inside And");
		}

		@Then("User is navigate the home page")
		public void user_is_navigate_the_home_page() {
			System.out.println("Inside Then");
		}

}
