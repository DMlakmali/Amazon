package cucumberTests;

import Pages.HomePage;
import Pages.PassWordReader;
import Tests.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends BaseTest {

	private HomePage homepage;
    private PassWordReader passWordReader;

	public LoginSteps() {
		setUp();
        homepage = new HomePage(driver);
        passWordReader = new PassWordReader();
	}

	@Given("user is on the Home page")
	public void user_is_on_the_home_page() {
       homepage.clickOnbtnContinueToHome();
	}

	@When("user click on sign in option")
	public void user_click_on_sign_in_option() {
        homepage.clickOnSignInLink();
	}

	@When("user enters valid {string}")
	public void user_enters_valid(String email) {
        homepage.enterEmail(email);
	}

    @When("user enters password")
    public void user_enters_password() {
    String password= passWordReader.readPassword();
    homepage.enterPassword(password);
    }

	@When("user skip keep hackers out page")
	public void user_skip_keep_hackers_out_page() {
		homepage.clickOnNotNow();
	}
	
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
        homepage.clickOnContinue();
	}
	
	@When("clicks the login button")
	public void clicks_the_login_button() {
        homepage.clickOnSignIn();
	}

	@Then("user should be navigated to the Home page")
	public void user_should_be_navigated_to_the_home_page() {
        Assert.assertTrue(homepage.isHomePageLoaded());
	}

}
