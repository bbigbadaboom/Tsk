package Test.Utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Asser {
    public static void isTrue(WebElement webElement) {
        Highlighter h = new Highlighter();
        h.highlight(webElement);
        h.uHhighlight(webElement);
        Assert.assertTrue(webElement.isDisplayed());
    }

    public static void isTrueForText(WebElement webElement, String s) {
        Highlighter h = new Highlighter();
        Assert.assertEquals(s, webElement.getText());

    }
}
