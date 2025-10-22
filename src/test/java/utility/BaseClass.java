package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		 ListenersLogic.driver = driver; // Assign to listener

	}

	@AfterMethod
	public void closeBrowser() {

	}

}


/*

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        ListenersLogic.driver = driver; // Assign to listener
    }


*/