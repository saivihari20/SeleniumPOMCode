package grotech.selenium.GroTechMindPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_LoginToFaceBook {

	@Test
	public void withValidCred() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage1 lp = new LoginPage1(driver);
		//lp.login_cookies();
		lp.un_Valid();
		lp.pwd_Valid();
		lp.login_button();
		driver.quit();

	}

}
