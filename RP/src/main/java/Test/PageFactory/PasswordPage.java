package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PasswordPage extends AbstractPage {

    @FindBy(id = "login-passwd")
    private WebElement passwordBox;

    @FindBy(name = "verifyPassword")
    private WebElement buttonForLogIn;

    public PasswordPage(WebDriver driver) {
        super(driver);
    }
    public void fillPasswordBox(String query) {
        sendKeys(passwordBox, query);
        //passwordBox.sendKeys(query);
    }

    public AccountPage logIn() {
        Waiters.waitForElementVisible(buttonForLogIn);
        click(buttonForLogIn);
        //$(buttonForLogIn).click();
        //buttonForLogIn.click();
        return new AccountPage(driver);
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }
}
