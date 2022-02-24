package pages;
import helper.DriverHandler;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(id = "header")
public class HeaderPage extends BasePage implements CanSearch  {
    @FindBy(id = "searchfor")
    private HtmlElement txtSearchBar;

    public HeaderPage(DriverHandler driverHandler) {
        super(driverHandler);
    }


    @Override
    public SearchResultPage searchProduct(String product) {
        txtSearchBar.sendKeys(product);
        txtSearchBar.sendKeys(Keys.ENTER);
        return new SearchResultPage(driverHandler);
    }
}
