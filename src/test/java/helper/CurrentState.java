package helper;

import pages.BasePage;

public class CurrentState {
    private String searchTerm;
    private BasePage currentPage;

    public CurrentState(){};

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public BasePage getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(BasePage currentPage) {
        this.currentPage = currentPage;
    }
}
