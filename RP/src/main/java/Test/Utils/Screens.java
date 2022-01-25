package Test.Utils;

import Test.Driver.DriverManager;
import Test.MyLogger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class Screens{
    private static WebDriver driver = DriverManager.getDriver();
    private static Logger logger;
    public static void makeScreen() {
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenName = "screen" + System.nanoTime();
        String scrPath = screenName + ".jpg";
        File copy = new File(scrPath);
        try {
            FileUtils.copyFile(screen, copy);
            MyLogger.info("Screenshot " + scrPath);
            MyLogger.attach(copy);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //capt(driver)
    }
}
