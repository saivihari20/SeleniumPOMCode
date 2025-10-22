package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='ap_email_login']")
	private WebElement username;
	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement idContinueButton;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInButton;

	@FindBy(id = "input-box-otp")
	private WebElement mobileOTP;

	@FindBy(xpath = "//*[text()='Submit code']")
	private WebElement submitCode;

	public void validUserName() {
		username.sendKeys("ghanta.saivihari@gmail.com");
	}

	public void continueButton() {
		idContinueButton.click();
	}

	public void userPasswprd() {
		password.sendKeys("AppleMacpro@24G");
	}

	public void clickSignInButton() {
		signInButton.click();
	}

	public void enterMobileOTP() {
		mobileOTP.sendKeys("");
	}

	public void submitMobileOTP() {
		submitCode.click();
	}

	public AmazonLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
