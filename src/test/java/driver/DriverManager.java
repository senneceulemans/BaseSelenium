package driver;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DriverManager  {

    public DriverManager() {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }

    public WebDriver getDriver(DriverType type){
        switch(type){
            case CHROME:
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.cookies", 1);
                prefs.put("network.cookie.cookieBehavior", 1);
                prefs.put("profile.block_third_party_cookies", false);

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("enable-automation");
                options.addArguments("--window-size=1920,1200");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-extensions");
                options.addArguments("--dns-prefetch-disable");
                options.addArguments("--disable-gpu");
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                options.setExperimentalOption("prefs", prefs);
                options.setExperimentalOption("useAutomationExtension", false);
                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                options.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
                options.setCapability(ChromeOptions.CAPABILITY, options);
                options.setCapability("Platform", Platform.ANY);
                options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                return new ChromeDriver(options);
            case FIREFOX:
            case EDGE:
            default:
                return null;
        }
    }


}
