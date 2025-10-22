package grotech.selenium.GroTechMindPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;

	// Step1 find locators private as r
	// encapsulation restricting as private
	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginButton;
	
	@FindBy(name = "cookies")//need the correct Xpath for accepting all cookies if any 
	private WebElement cookiesAccepting;

	// Step2 Create a method for each component

	public void un_Valid() {
		username.sendKeys("saivihari");
	}

	public void pwd_Valid() {
		password.sendKeys("password");
	}

	public void login_button() {
		loginButton.click();
	}
	
	public void login_cookies() {
		cookiesAccepting.click();
	}
	
	

	// Step3 initialising elements with PageFactory

	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
