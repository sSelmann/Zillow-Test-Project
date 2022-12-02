package StepDefinitions;

import Pages.HeaderContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;

public class PriceFilterSteps {
    HeaderContent dc=new HeaderContent();

    @Given("Navigate to Zillow")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://www.zillow.com/");
        GWD.getDriver().manage().window().maximize();
    }
}
