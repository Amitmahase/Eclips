package StepDefination;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given.Givens;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Givens("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        
    }

    @When("^USer login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    }
    

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        
    }

}