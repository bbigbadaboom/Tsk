package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {
    @FindBy(id = "login-username")
    private WebElement loginBox;

    @FindBy(id = "username-field-icon")
    private WebElement accountIcon;

    @FindBy(id = "login-signin")
    private WebElement buttonForPass;

    @FindBy(xpath = "//label[text() = 'Оставаться в сети']")
    private WebElement nosaving;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginBox(String query) {
        sendKeys(loginBox, query);
        //$(loginBox).setValue(query);
        //loginBox.sendKeys(query);
    }

    public PasswordPage goToPasswordPage() {
        Waiters.waitForElementVisible(buttonForPass);
        click(nosaving);
        click(buttonForPass);
        //$(nosaving).click();
        //$(buttonForPass).click();
        //buttonForPass.click();
        return new PasswordPage(driver);
    }

    public WebElement getLoginBox() {
        return loginBox;
    }

    public void setLoginBox(WebElement loginBox) {
        this.loginBox = loginBox;
    }

    public WebElement getAccountIcon() {
        return accountIcon;
    }

    public void setAccountIcon(WebElement accountIcon) {
        this.accountIcon = accountIcon;
    }
}
