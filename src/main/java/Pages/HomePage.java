package Pages;

import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {
    private String inputSearch = "(//input[@id='twotabsearchtextbox'])[1]";

    public HomePage(WebDriver webdriver) {
        super(webdriver);
    }


    public void searchproduct(String product) {
    	fillAndEnter(inputSearch, product);
    }


}
