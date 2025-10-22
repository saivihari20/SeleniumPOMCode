package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends ListenersLogic
{


	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@AfterMethod
	public void closeBrowser() {
			driver.quit();
	}

}


/*

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        ListenersLogic.driver = driver; // Assign to listener
    }


*/