package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement mouseaction;

	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signInButton;

	@FindBy(xpath = "//*[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchField;
	

	
	
	
	
	
	public void hoveroveronActionList(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(mouseaction).perform();
	}

	public void signInFromHomePage() {
		signInButton.click();
	}

	public void signOutAmazon() {
		signOut.click();
	}
	public void searchFieldArea() {
		searchField.sendKeys("shoes" +Keys.ENTER);
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
