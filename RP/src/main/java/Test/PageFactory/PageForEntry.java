package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageForEntry extends AbstractPage {
    @FindBy(xpath = "//a[text() = 'Войти']")
    private WebElement enter;
    public PageForEntry(WebDriver driver) {
        super(driver);
    }
    public LoginPage goToLogPage() {
        Waiters.waitForElementVisible(enter);
        click(enter);
        //$(enter).click();
        //enter.click();
        return new LoginPage(driver);
    }
}
