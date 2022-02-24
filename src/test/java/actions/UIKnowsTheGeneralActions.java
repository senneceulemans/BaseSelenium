package actions;

import helper.CurrentState;
import pages.HomePage;

public class UIKnowsTheGeneralActions implements KnowsTheGeneralActions {
    private CurrentState currentState;

    public UIKnowsTheGeneralActions(CurrentState currentState){
        this.currentState = currentState;
    }

    @Override
    public void handleCookie() {
        ((HomePage)currentState.getCurrentPage()).handleCookie();
    }
}
