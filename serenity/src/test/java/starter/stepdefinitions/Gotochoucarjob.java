package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.matchers.HomePage;
import starter.matchers.VerifyPage;

public class Gotochoucarjob {

    @Steps
    HomePage home;

    @Steps
    VerifyPage ver;
    @Given("User is on  home page")
    public void user_is_on_home_page() {
        home.openAplication();

    }


    @When("user entry to job first")
    public void userEntryToJobFirst() {
        home.entry_job();
    }



    @Then("user verify all and title")
    public void user_verify_all_and_title() {
        ver.verifyTitle();

    }



}
