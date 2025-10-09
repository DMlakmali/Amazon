package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchResultsPage;

public class GuestFlowTest extends BaseTest {
	private HomePage homepage;
	private SearchResultsPage searchresultspage;

	@BeforeClass
	public void init() {

		homepage = new HomePage(driver);

	}

	@Test
	public void loginAsAGuest() {

		// search product
		homepage.searchproduct("headset");
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// verify that the search results are displayed
		Reporter.log("verify that the search results are displayed");
		searchresultspage = new SearchResultsPage(driver);
		Assert.assertEquals(searchresultspage.getHeaderText(), "Results", "Header value is not equal to Results");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
