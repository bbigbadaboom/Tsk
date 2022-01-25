package Test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendsPage extends AbstractPage {

    @FindBy(xpath = "//div[text()='Hello max']")
    private WebElement body;

    public SendsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBody() {
        return body;
    }
}
