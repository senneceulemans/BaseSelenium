package glue;

import actions.AutomationAPI;
import io.cucumber.java.en.Given;

public class GeneralSteps {
    private final AutomationAPI api;

    public GeneralSteps(AutomationAPI api){
        this.api=api;
    }

    @Given("the user searches for product {word}")
    public void theUserSearchesForProduct(String product) {
        api.knowsTheSearch().searchForProduct(product);
    }



}
