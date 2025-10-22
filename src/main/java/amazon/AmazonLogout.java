package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogout {

	@FindBy(xpath = "//*[text()='Sign Out']")
	private WebElement signOut;

	public void signOutAmazon() {
		signOut.click();
	}

	public void amazonLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
