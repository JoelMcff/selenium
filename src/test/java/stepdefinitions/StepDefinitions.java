package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SideBarPage;


public class StepDefinitions {
    public StepDefinitions(){}

    private final WebDriver driver = Hooks.getDriver();

    private final HomePage homePage = new HomePage(driver);
    private final SideBarPage sideBarPage = new SideBarPage(driver);


    @Given("I open the page")
    public void iOpenThePage() {
        homePage.navigateToHomePage();
    }

    @When("I click the button")
    public void i_click_the_button() throws InterruptedException {
        homePage.clickElementsCard();
    }

    @Then("I see the result")
    public void i_see_the_result() {
    }

    @And("I click textbox sidebar button")
    public void iClickTextboxSidebarButton() throws InterruptedException {
        sideBarPage.clickTextboxSidebar();
    }
}
