package StepDefinitions;

import Pages.HeaderContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class PriceFilterSteps {
    HeaderContent hd=new HeaderContent();

    @Given("Navigate to Zillow")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://www.zillow.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click on the element in the Header Content")
    public void clickOnTheElementInTheHeaderContent(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            hd.findAndClick(listElement.get(i));
        }

    }
}
