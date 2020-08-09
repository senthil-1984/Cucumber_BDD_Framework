package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {
	@Given("^User is on Netbanking Landing page$")
	public void user_is_on_Netbanking_Landing_page() throws Throwable {
		System.out.println("Netbanking");
		//throw new PendingException();
	}

	//@When("^User login into application with username and password$")
	//public void user_login_into_application_with_username_and_password() throws Throwable {
		//System.out.println("Enter User name and password");
		//throw new PendingException();	
	//}
	
    @When("^User login into application with \"([^\"]*)\" username and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_username_and_password_something(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Populate home page");
		//throw new PendingException();
		System.out.println("demo");
	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Card Page displayed");
		//throw new PendingException();
	}

}
