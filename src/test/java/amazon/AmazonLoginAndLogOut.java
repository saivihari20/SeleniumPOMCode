package amazon;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
@Listeners(ListenersLogic.class)
public class AmazonLoginAndLogOut extends BaseClass {

	@Test
	public void withValidCred() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.hoveroveronActionList(driver);
		Thread.sleep(2000);
		homepage.signInFromHomePage();
		Thread.sleep(2000);
		Reporter.log("HomePage-HOverover on Account and list->click on Sigin");
		AmazonLoginPage loginpage = new AmazonLoginPage(driver);
		loginpage.validUserName();
		Reporter.log("Entered the UN");
		loginpage.continueButton();

		loginpage.userPasswprd();
		Reporter.log("Entered the Password");
		loginpage.clickSignInButton();

		homepage.hoveroveronActionList(driver);
		Thread.sleep(2000);
		Reporter.log("Hoverover Account and List");
		homepage.signOutAmazon();
		Reporter.log("SIgnout from AMazon");
		driver.quit();

	}

}
