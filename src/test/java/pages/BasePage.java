package pages;

import helper.DriverHandler;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public abstract class BasePage {

    protected DriverHandler driverHandler;

    public BasePage(DriverHandler driverHandler){
        this.driverHandler = driverHandler;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driverHandler.getDriver())),this);
    }
}
