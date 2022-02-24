package helper;

import org.openqa.selenium.WebDriver;

public class DriverHandler {
    private WebDriver driver;
    private String baseUrl;

    public DriverHandler(){
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void quit(  ){
        if (driver != null){
            driver.quit();
        }
    }

    public void maximizeScreen() {
        driver.manage().window().maximize();
    }
}
