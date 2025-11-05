package Pages;

import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {
    private String inputSearch = "(//input[@id='twotabsearchtextbox'])[1]";
    private String inputEmail = "//input[@id='ap_email_login']";
    private String inputPassword = "//input[@id='ap_password']";
    private String btnNotNow = "//a[@id='ap-account-fixup-phone-skip-link']";
    private String btnContinue = "//input[@id='continue']";
    private String btnSignIn = "//input[@id='signInSubmit']";
    private String linkSignIn = "//span[@id='nav-link-accountList-nav-line-1']";
    private String btnContinuetoHome = "//button[@type='submit']";
    private String lblHello = "//span[contains(text(),'Hello')]";

    public HomePage(WebDriver webdriver) {
        super(webdriver);
    }


    public void searchproduct(String product) {
    	fillAndEnter(inputSearch, product);
    }
    
    public void enterEmail(String email) {
    	fillAndEnter(inputEmail, email);
    }
    
    public void enterPassword(String password) {
    	fillAndEnter(inputPassword, password);
    }
    
    public void clickOnNotNow() {
    	if(isPresent(btnNotNow)) {
    	click(btnNotNow);
    	}
    }
    
    public void clickOnContinue() {
    	click(btnContinue);
    }
    
    
    public void clickOnSignIn() {
    	click(btnSignIn);
    }

    public void clickOnSignInLink(){
        click(linkSignIn);
    }

    public void clickOnbtnContinueToHome(){
        if(isPresent(btnContinuetoHome)){
        click(btnContinuetoHome);}
    }

    public boolean isHomePageLoaded(){
        return isDisplayed(lblHello);
    }
    
    


}
