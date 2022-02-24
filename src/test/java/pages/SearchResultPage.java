package pages;

import helper.DriverHandler;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class SearchResultPage extends BasePage {
    @FindBy(css = "#js_listpage_objects strong")
    private HtmlElement txtSearchTitle;

    public SearchResultPage(DriverHandler driverHandler) {
        super(driverHandler);
    }

    public String getSearchTitel() {
        return txtSearchTitle.getText();
    }
}
