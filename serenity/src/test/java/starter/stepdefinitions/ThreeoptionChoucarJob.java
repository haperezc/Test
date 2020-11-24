package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.thirdoption.ThreeHomePage;

public class ThreeoptionChoucarJob {

    @Steps
    ThreeHomePage Three_home;
    @Given("User be home page")
    public void user_be_home_page() {
        Three_home.open_Browser();

    }

    @When("User apply to the offer")
    public void user_apply_to_the_offer() {
        Three_home.click_apply();

    }

    @Then("user completed formulary")
    public void user_completed_formulary() {

    }




}
