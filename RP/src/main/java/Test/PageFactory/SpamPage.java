package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SpamPage extends AbstractPage {

    @FindBy(xpath = "//span[contains(.,'Re: Letter')]")
    private WebElement checkLetter;

    @FindBy(xpath = "//a/div/div/div/button/span")
    private WebElement checkBox;

    @FindBy(xpath = "//a[contains(@class, 'W_6D6F C_Z281SGl D_F u_b')]")
    private WebElement el;

    @FindBy(xpath = "//span[contains(.,'Не спам')]")
    private WebElement delFromSpam;

    public SpamPage(WebDriver driver) {
        super(driver);
    }

    public void deleteFromSpam() {
        Waiters.waitForElementVisible(checkBox);
        click(checkBox);
        click(delFromSpam);
        //$(checkBox).click();
        //checkBox.click();
        //$(delFromSpam).click();
        //delFromSpam.click();
    }

    public void click() {
        click(el);
        //$(el).click();
        //el.click();
    }

    public WebElement getCheckLetter() {
        return checkLetter;
    }
}
