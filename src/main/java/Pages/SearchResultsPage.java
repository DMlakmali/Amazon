package Pages;


import org.openqa.selenium.WebDriver;


public class SearchResultsPage extends PageBase {


    private String headerResults = "(//h2[normalize-space()='Results'])[1]";
    

    public SearchResultsPage(WebDriver webdriver) {
        super(webdriver);
    }


    public String getHeaderText(){
        return getText(headerResults);
    }

  


}
