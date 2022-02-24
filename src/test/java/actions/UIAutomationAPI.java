package actions;

public class UIAutomationAPI implements AutomationAPI {
    private KnowsTheSearch knowsTheSearch;

    public UIAutomationAPI (KnowsTheSearch knowsTheSearch){
        this.knowsTheSearch = knowsTheSearch;
    }

    @Override
    public KnowsTheSearch knowsTheSearch() {
        return knowsTheSearch;
    }
}
