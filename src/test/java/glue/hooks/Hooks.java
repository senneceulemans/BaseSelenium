package glue.hooks;

import driver.DriverManager;
import driver.DriverType;
import helper.CurrentState;
import helper.DriverHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.HomePage;


public class Hooks {
    private DriverHandler driverHandler;
    private DriverManager driverManager;
    private CurrentState currentState;

    private final String url = "www.bol.com"; //Put in config file

    public Hooks(DriverHandler driverHandler, DriverManager driverManager,CurrentState currentState) {
        this.driverHandler = driverHandler;
        this.driverManager =driverManager;
        this.currentState = currentState;
    }

    @Before
    public void beforeScenario(DriverHandler driverHandler) {
        driverHandler.setDriver(driverManager.getDriver(DriverType.CHROME)); //Get from system property
        driverHandler.setBaseUrl(url);
        driverHandler.navigateTo(url);
        driverHandler.maximizeScreen();
        currentState.setCurrentPage(new HomePage(driverHandler));
    }

    @After
    public void afterScenario(Scenario scenario) {
        driverHandler.quit();
    }


}
