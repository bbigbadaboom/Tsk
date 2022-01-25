package Test.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Singleton example
public class DriverManager {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }
    public static void setDriver() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
    }
}
