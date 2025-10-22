package amazon;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
@Listeners(ListenersLogic.class)
public class AmazonToLogin extends BaseClass {

	@Test
	public void withValidCred() throws Exception {
		HomePage homepage = new HomePage(driver);
		homepage.hoveroveronActionList(driver);
		Thread.sleep(2000);
		homepage.signInFromHomePage();
		Thread.sleep(2000);
		Reporter.log("HomePage-HOverover on Account and list->click on Sigin");
		AmazonLoginPage loginpage = new AmazonLoginPage(driver);
		loginpage.validUserName();
		loginpage.continueButton();
		Reporter.log("Entered the UN");
		loginpage.userPasswprd();
		loginpage.clickSignInButton();
		Reporter.log("Entered the Password");
		
		Thread.sleep(1000);
		Reporter.log("Login is Successful");

		/*homepage.hoveroveronActionList(driver);
		Thread.sleep(2000);
		homepage.signOutAmazon();*/

		//driver.quit();

	}

}
