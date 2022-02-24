package actions;

import helper.CurrentState;
import org.testng.Assert;
import pages.BasePage;
import pages.CanSearch;
import pages.SearchResultPage;

public class UIKnowsTheSearch implements KnowsTheSearch {
    private CurrentState currentState;

    public UIKnowsTheSearch(CurrentState currentState){
        this.currentState = currentState;
    }

    @Override
    public void searchForProduct(String product) {
        currentState.setSearchTerm(product);
        BasePage currentPage = ((CanSearch)currentState.getCurrentPage()).searchProduct(product);
        currentState.setCurrentPage(currentPage);
    }

    @Override
    public void validateSearchResults() {
        String shownSearchTitel = ((SearchResultPage)currentState.getCurrentPage()).getSearchTitel();
        Assert.assertEquals(shownSearchTitel.toLowerCase(),currentState.getSearchTerm().toLowerCase(),"Validate the search title");
    }
}
