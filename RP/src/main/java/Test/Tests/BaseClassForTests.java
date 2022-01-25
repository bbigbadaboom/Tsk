package Test.Tests;

import Test.Driver.DriverManager;;
import Test.MyLogger;
import Test.Utils.Screens;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClassForTests {

    protected WebDriver driver;

//    private static byte[] capt(WebDriver driver) {
//        byte[] screen = null;
//        screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        return screen;
//    }

    @BeforeClass(alwaysRun = true)
    protected void initBrowser() {
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(ITestResult res) {
        if (res.getStatus() == ITestResult.FAILURE) {
            MyLogger.error("Error");
            Screens.makeScreen();
        }
    }
}
