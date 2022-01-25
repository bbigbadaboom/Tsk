package Test.StrategyForContacts;

import Test.BO.Contact;
import Test.BO.NewContact;
import Test.BO.User;
import Test.PageFactory.AccountPage;
import Test.PageFactory.HomePageForYahoo;
import Test.PageFactory.LoginPage;
import Test.PageFactory.PasswordPage;
import org.openqa.selenium.WebDriver;

public class FirstContactStategy implements ContactsStrategy {

    public void createNewContact(WebDriver driver) {
        Contact contact = new Contact(NewContact.getName(), NewContact.getSurname(), NewContact.getMail());
        HomePageForYahoo home = new HomePageForYahoo(driver);
        home.open();
       // PageForEntry pageForEntry = home.enterAcc();
        LoginPage loginPage = home.enterAcc();
        loginPage.fillLoginBox(new User().getLog());
        PasswordPage passwordPage = loginPage.goToPasswordPage();
        passwordPage.fillPasswordBox(new User().getPass());
        AccountPage acc = passwordPage.logIn();
        acc.addContact();
        acc.fillFieldsInContacts(contact);
        acc.saveContact();
    }
}
