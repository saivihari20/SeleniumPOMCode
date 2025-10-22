package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersLogic implements ITestListener {

    // This should be assigned from your test class before the tests run
    public static WebDriver driver;

    // Folder paths
    private static final String PASS_FOLDER = "C:\\D_DriveFolder\\Vihari\\Automation_2025\\GroTechMind_25\\eclipse_WS_pom\\GroTechMindPom\\screenshots\\Pass\\";
    private static final String FAIL_FOLDER = "C:\\D_DriveFolder\\Vihari\\Automation_2025\\GroTechMind_25\\eclipse_WS_pom\\GroTechMindPom\\screenshots\\Failed\\";

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Test Passed: " + result.getName(), true);
        takeScreenshot(result.getName(), "Pass");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Test Failed: " + result.getName(), true);
        takeScreenshot(result.getName(), "Failed");
    }

    private void takeScreenshot(String testName, String status) {
        if (driver == null) {
            Reporter.log("WebDriver is null, cannot take screenshot.", true);
            return;
        }

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            // Create timestamp for uniqueness
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            // Decide the folder
            String folderPath = status.equalsIgnoreCase("Pass") ? PASS_FOLDER : FAIL_FOLDER;

            // Create the destination file with test name and timestamp
            File destFile = new File(folderPath + testName + "_" + timestamp + ".png");

            FileHandler.copy(srcFile, destFile);
            Reporter.log("Screenshot saved to: " + destFile.getAbsolutePath(), true);

        } catch (IOException e) {
            Reporter.log("Failed to save screenshot: " + e.getMessage(), true);
        }
    }
}
