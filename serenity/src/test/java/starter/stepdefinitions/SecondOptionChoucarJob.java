package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.secondoptions.TwoHomePage;

public class SecondOptionChoucarJob {

    @Steps
    TwoHomePage Twopage;

    @Given("User entry home page")
    public void user_entry_home_page() {
        Twopage.openNavigator();

    }

    @When("user entry to job second method")
    public void user_entry_to_job_second_method() {
        Twopage.option_Two();

    }

    @Then("user sends place")
    public void userSendsPlace() {
        Twopage.sen_place();
    }





}
