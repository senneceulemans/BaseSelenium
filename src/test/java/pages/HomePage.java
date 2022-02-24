package pages;

import helper.DriverHandler;
import pages.blocks.Header;

public class HomePage extends BasePage implements CanSearch {
    private Header header;

    public HomePage(DriverHandler driverHandler) {
        super(driverHandler);
    }

    @Override
    public SearchResultPage searchProduct(String product) {
       header.searchProduct(product);
       return new SearchResultPage(driverHandler);
    }
}
