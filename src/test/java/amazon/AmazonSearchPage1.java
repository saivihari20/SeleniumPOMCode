package amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
@Listeners(ListenersLogic.class)
public class AmazonSearchPage1 extends BaseClass {
	
	@Test
	public void amazonSearchingProduct() throws Exception {
	HomePage homepage = new HomePage(driver);
	homepage.hoveroveronActionList(driver);
	Thread.sleep(2000);
	homepage.signInFromHomePage();
	Thread.sleep(2000);
	AmazonLoginPage loginpage = new AmazonLoginPage(driver);
	loginpage.validUserName();
	loginpage.continueButton();

	loginpage.userPasswprd();
	loginpage.clickSignInButton();
	Thread.sleep(2000);
	homepage.searchFieldArea();
	Thread.sleep(2000);
	

	homepage.hoveroveronActionList(driver);
	Thread.sleep(2000);
	homepage.signOutAmazon();
	//driver.quit();

}
}
