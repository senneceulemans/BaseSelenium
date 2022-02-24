package glue;

import actions.AutomationAPI;
import io.cucumber.java.en.Given;

public class GeneralSteps {
    private final AutomationAPI api;

    public GeneralSteps(AutomationAPI api){
        super();
        this.api=api;
    }

    @Given("the user searches for product {string}")
    public void theUserSearchesForProduct(String product) {
        api.knowsTheSearch().searchForProduct(product);
    }

    @Given("the search result page is correct")
    public void theSearchResultPageIsCorrect() {
        api.knowsTheSearch().validateSearchResults();
    }



}
