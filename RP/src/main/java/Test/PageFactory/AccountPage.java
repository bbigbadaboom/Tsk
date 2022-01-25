package Test.PageFactory;

import Test.BO.Contact;
import Test.Utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy(linkText = "Написать")
    private WebElement buttonForNewLetter;


    @FindBy(xpath = "//span[text()='Черновики']") // черн
    private WebElement drafts;

    @FindBy(xpath = "//span[text()='Входящие']")
    private WebElement gets;

    @FindBy(xpath = "//span[text()='Отправленные']")
    private WebElement sends;

    @FindBy(xpath = "//span[text()='Спам']")
    private WebElement spam;

    @FindBy(xpath = "//span[contains(.,'Maxim')]")
    private WebElement acc; //аккаунт

    @FindBy(xpath = "//a[@id='profile-signout-link']/span[2]")
    private WebElement buttonForExit;

    @FindBy(xpath = "//button[@aria-label='Контакты']")
    private WebElement buttonForContacts;

    @FindBy(xpath = "//button[contains(.,'Добавить новый контакт')]")
    private WebElement buttonForAdding;

    @FindBy(xpath = "(//input[@value=''])[3]")
    private WebElement name;

    @FindBy(xpath = "(//input[@value=''])[4]")
    private WebElement surname;

    @FindBy(xpath = "(//input[@value=''])[5]")
    private WebElement mail;

    @FindBy(xpath = "//button[contains(.,'Сохранить')]")
    private WebElement buttonForSave;

    @FindBy(linkText = "kost_434@mail.ru")
    private WebElement checkCreation;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public LetterPage writeNewMail() {
        Waiters.waitForElementVisible(buttonForNewLetter);
        click(buttonForNewLetter);
        //$(buttonForNewLetter).click();
        //buttonForNewLetter.click();
        return new LetterPage(driver);
    }

    public DraftsPage goToDrafts() {
        Waiters.waitForElementVisible(drafts);
        click(drafts);
        //$(drafts).click();
        //drafts.click();
        return new DraftsPage(driver);
    }

    public SendsPage goToSends() {
        Waiters.waitForElementVisible(sends);
        click(sends);
        //$(sends).click();
        //sends.click();
        return new SendsPage(driver);
    }

    public HomePageForYahoo exitFromAcc() {
        Waiters.waitForElementVisible(acc);
        click(acc);
        //$(acc).click();
        //acc.click();
        Waiters.waitForElementVisible(buttonForExit);
        click(buttonForExit);
        //$(buttonForExit).click();
        //buttonForExit.click();
        return new HomePageForYahoo(driver);
    }

    public void addContact() {
        Waiters.waitForElementVisible(buttonForContacts);
        click(buttonForContacts);
        //$(buttonForContacts).click();
        //buttonForContacts.click();
        Waiters.waitForElementVisible(buttonForAdding);
        click(buttonForAdding);
        //$(buttonForAdding).click();
        //buttonForAdding.click();
    }

    public void fillFieldsInContacts(Contact contact) {
        sendKeys(name, contact.getName());
        //$(name).setValue(contact.getName());
        //name.sendKeys(contact.getName());
        sendKeys(surname, contact.getSurname());
        //$(surname).setValue(contact.getSurname());
        //surname.sendKeys(contact.getSurname());
        sendKeys(mail, contact.getMail());
        //$(mail).setValue(contact.getMail());
        //mail.sendKeys(contact.getMail());
    }

    public IncomePage getIncomesPage() {
        Waiters.waitForElementVisible(gets);
        click(gets);
        //$(gets).click();
        //gets.click();
        return new IncomePage(driver);
    }

    public SpamPage goToSpam() {
        click(spam);
        //$(spam).click();
        //spam.click();
        return new SpamPage(driver);
    }

    public void saveContact() {
        click(buttonForSave);
        //$(buttonForSave).click();
        //buttonForSave.click();
    }

    public WebElement getButtonForNewLetter() {
        return buttonForNewLetter;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getCheckCreation() {
        return checkCreation;
    }
}
