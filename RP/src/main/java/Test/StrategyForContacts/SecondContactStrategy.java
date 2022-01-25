package Test.StrategyForContacts;

import Test.BO.Contact;
import Test.BO.NewContactTwo;
import Test.BO.User;
import Test.PageFactory.AccountPage;
import Test.PageFactory.HomePageForYahoo;
import Test.PageFactory.LoginPage;
import Test.PageFactory.PasswordPage;
import org.openqa.selenium.WebDriver;

public class SecondContactStrategy implements ContactsStrategy {
    public void createNewContact(WebDriver driver) {
        Contact contact = new Contact(NewContactTwo.getName(), NewContactTwo.getSurname(), NewContactTwo.getMail());
        HomePageForYahoo home = new HomePageForYahoo(driver);
        home.open();
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
