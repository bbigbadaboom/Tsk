package Test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DraftsPage extends AbstractPage {


    @FindBy(xpath = "//span[text()='Letter']")
    private WebElement theme;

    @FindBy(xpath = "//div[text()='Hello max']")
    private WebElement body;

    @FindBy(xpath = "//span[contains(.,'Папка Черновики пуста.')]")
    private WebElement emtyDrafts;

    public DraftsPage(WebDriver driver) {
        super(driver);
    }

    public LetterPage openLetter() {
        click(theme);
        //$(theme).click();
        //theme.click();
        return new LetterPage(driver);
    }


    public WebElement getTheme() {
        return theme;
    }

    public WebElement getBody() {
        return body;
    }

    public WebElement getEmtyDrafts() {
        return emtyDrafts;
    }
}
