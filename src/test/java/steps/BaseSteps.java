package steps;

import PO.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseSteps {
    BasePage basePage = new BasePage();
    @When("I open device page")
    public void opendevicePage() {
        basePage.opendevicePage();
    }

    @Then("go to Laptops page")
    public void goToLaptopsPage() throws InterruptedException {
        basePage.gotoLaptopsLink();
    }
}
