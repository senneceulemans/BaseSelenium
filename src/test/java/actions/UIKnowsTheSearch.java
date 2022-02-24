package actions;

import helper.CurrentState;
import pages.CanSearch;

public class UIKnowsTheSearch implements KnowsTheSearch {
    private CurrentState currentState;

    public UIKnowsTheSearch(CurrentState currentState){
        this.currentState = currentState;
    }

    @Override
    public void searchForProduct(String product) {
        currentState.setSearchTerm(product);
        ((CanSearch)currentState.getCurrentPage()).searchProduct(product);
    }
}
