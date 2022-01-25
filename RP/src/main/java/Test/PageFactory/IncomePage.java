package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class IncomePage extends AbstractPage {

    @FindBy(xpath = "//a/div/div/div/button/span")
    private WebElement checkbox;

    @FindBy(xpath = "//span[contains(.,'Letter')]")
    private WebElement checkIncome;

    @FindBy(xpath = "//div[4]/button/span")
    private WebElement spamButton;

    @FindBy(xpath = "//span[contains(.,'Папка Входящие пуста.')]")
    private WebElement emptyFolder;

    public IncomePage(WebDriver driver) {
        super(driver);
    }

    public void addToSpam() {
        Waiters.waitForElementVisible(checkbox);
        click(checkbox);
        //$(checkbox).click();
        //checkbox.click();
        click(spamButton);
        //$(spamButton).click();
        //spamButton.click();
    }

    public WebElement getCheckIncome() {
        return checkIncome;
    }
}
