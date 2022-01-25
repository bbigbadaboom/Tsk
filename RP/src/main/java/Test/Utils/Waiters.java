package Test.Utils;

import Test.Driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    private static final int WAIT_FOR_ELEMENT_SECONDS = 20;
    private static final int WAIT_FOR_ELEMENT = 15;

    public static void waitForElement() {
        new WebDriverWait(DriverManager.getDriver(), WAIT_FOR_ELEMENT);
    }

    public static void waitForElementVisible(WebElement w) {
        new WebDriverWait(DriverManager.getDriver(), WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOf(w));
    }

}
