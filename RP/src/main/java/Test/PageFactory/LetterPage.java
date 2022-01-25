package Test.PageFactory;

import Test.BO.Letters.Letter;
import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class LetterPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='message-to-field']")
    private WebElement whom;

    @FindBy(xpath = "//input[contains(@class, 'q_T y_Z2hYGcu')]")
    private WebElement theme;

    @FindBy(xpath = "//div[@id='editor-container']/div")
    private WebElement body;

    @FindBy(xpath = "//div/span/button/span")
    private WebElement savingAsDraft;

    @FindBy(xpath = "//span[contains(.,'Отправить')]")
    private WebElement send;

    public LetterPage(WebDriver driver) {
        super(driver);
    }

    public void fillFields(Letter l) {
        sendKeys(whom, l.getWhom());
        //$(whom).setValue(l.getWhom());
        //whom.sendKeys(l.getWhom());
        sendKeys(theme, l.getTheme());
        //$(theme).setValue(l.getTheme());
        //theme.sendKeys(l.getTheme());
        sendKeys(body, l.getBody());
        //$(body).setValue(l.getBody());
        //body.sendKeys(l.getBody());
    }

    public AccountPage saveLetter() {
        Waiters.waitForElementVisible(savingAsDraft);
        click(savingAsDraft);
        //$(savingAsDraft).click();
        //savingAsDraft.click();
        return new AccountPage(driver);
    }

    public AccountPage sendLetter() {
        Waiters.waitForElementVisible(send);
        click(send);
        //$(send).click();
        //send.click();
        return new AccountPage(driver);
    }

}
