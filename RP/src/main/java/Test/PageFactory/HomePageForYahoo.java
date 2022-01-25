package Test.PageFactory;

import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePageForYahoo extends AbstractPage {
    private static final String URL = "https://www.yahoo.com/";

    @FindBy(id = "ybarMailLink")
    private WebElement accountEntry;

    @FindBy(xpath = "//a[@id='ybarMailLink']/span")
    private WebElement exitCheck;

    public HomePageForYahoo(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(URL);
    }
    public LoginPage enterAcc() {
        Waiters.waitForElementVisible(accountEntry);
        click(accountEntry);
        //$(accountEntry).click();
        //accountEntry.click();
        return new LoginPage(driver);
    }
    public WebElement getExitCheck() {
        return exitCheck;
    }
}
