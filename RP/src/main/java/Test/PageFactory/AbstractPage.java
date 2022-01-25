package Test.PageFactory;

import Test.MyLogger;
import Test.Utils.Highlighter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    protected static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void click(WebElement webElement) {
        Highlighter h = new Highlighter();
        MyLogger.info("Clicking element " + webElement.getText());
        h.highlight(webElement);
        h.uHhighlight(webElement);
        webElement.click();
    }

    public static void sendKeys(WebElement webElement, String s) {
        Highlighter h = new Highlighter();
        MyLogger.debug("Sending data");
        h.highlight(webElement);
        h.uHhighlight(webElement);
        webElement.sendKeys(s);
    }


}
