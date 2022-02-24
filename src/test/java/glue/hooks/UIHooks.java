package glue.hooks;

import actions.KnowsTheGeneralActions;
import driver.DriverManager;
import driver.DriverType;
import helper.CurrentState;
import helper.DriverHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.HomePage;


public class UIHooks {
    private DriverHandler driverHandler;
    private DriverManager driverManager;
    private CurrentState currentState;
    private KnowsTheGeneralActions knowsTheGeneralActions;


    private final String url = "https://www.bol.com"; //Put in config file

    public UIHooks(DriverHandler driverHandler, DriverManager driverManager, CurrentState currentState, KnowsTheGeneralActions knowsTheGeneralActions) {
        this.driverHandler = driverHandler;
        this.driverManager =driverManager;
        this.currentState = currentState;
        this.knowsTheGeneralActions = knowsTheGeneralActions;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        driverHandler.setDriver(driverManager.getDriver(DriverType.CHROME)); //Get from system property
        driverHandler.setBaseUrl(url);
        driverHandler.navigateTo(url);
        driverHandler.maximizeScreen();
        currentState.setCurrentPage(new HomePage(driverHandler));
        knowsTheGeneralActions.handleCookie();
    }

    @After
    public void afterScenario(Scenario scenario) {
        driverHandler.quit();
    }


}
