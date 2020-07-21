package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NumberSequenceFinderPage;
import utils.ConfigurationReader;
import utils.DriverFactory;

import static org.junit.Assert.assertEquals;

public class NumberSequenceFinderStepDefinitions {

    private final NumberSequenceFinderPage numberSequenceFinderPage=new NumberSequenceFinderPage();

    @When("user navigates to NumberSequenceFinder page")
    public void user_navigates_to_NumberSequenceFinder_page() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("landing_url"));
        numberSequenceFinderPage.navigateToFind123();
    }

    @Then("user should see the headline Number Sequence Finder")
    public void user_should_see_the_headline_Number_Sequence_Finder() {
    String h1Title=numberSequenceFinderPage.getTextOfTheTitle();
    assertEquals(h1Title,"Number Sequence Finder");
    }

    @When("user inputs {string}")
    public void user_inputs(String string) throws InterruptedException {
        numberSequenceFinderPage.inputText(string);
        numberSequenceFinderPage.clickSearch();
        //I used thread sleep for visualizing the scenario
        Thread.sleep(2000);
    }

    @Then("result should be {string}")
    public void result_should_be(String string) {
    String actual=numberSequenceFinderPage.getResultText();
    assertEquals(string,actual);
    }

}
