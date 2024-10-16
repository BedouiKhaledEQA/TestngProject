package steps;

import end2endTest.inspectHomePage;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inspectHomePageSteps extends Hooks {
    inspectHomePage InspectHP;

    @Given("User open the browsers")
    public void user_open_the_browsers() {

        beforeALlMethode("chrome");


    }
    @When("User click on item")
    public void user_click_on_item() {
        InspectHP =new inspectHomePage();
        InspectHP.performInspectElement();


    }
    @Then("Item page should be displayed")
    public void item_page_should_be_displayed() {

    }

}
