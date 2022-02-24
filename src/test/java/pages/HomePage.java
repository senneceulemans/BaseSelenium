package pages;

import helper.DriverHandler;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


public class HomePage extends HeaderPage {
    @FindBy(css = ".consent-modal__footer .ui-btn--primary")
    private HtmlElement btnAcceptCookie;

    @FindBy(css = ".js-country-language-btn")
    private HtmlElement btnAcceptLang;

    public HomePage(DriverHandler driverHandler) {
        super(driverHandler);
    }


    public void handleCookie() {
        btnAcceptCookie.click();
        btnAcceptLang.click();
    }
}
