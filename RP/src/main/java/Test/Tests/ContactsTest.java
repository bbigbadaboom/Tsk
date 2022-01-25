package Test.Tests;

import Test.PageFactory.AccountPage;
import Test.StrategyForContacts.ContactsStrategy;
import Test.StrategyForContacts.FirstContactStategy;
import Test.StrategyForContacts.SecondContactStrategy;
import Test.Utils.Asser;
import org.testng.annotations.Test;

public class ContactsTest extends BaseClassForTests {
//    @Test
//    public void testContactsCreation() {
//        //Go to account
//        HomePageForYahoo home = new HomePageForYahoo(driver);
//        Logging.log("Go to account");
//        home.open();
//        PageForEntry pageForEntry = home.enterAcc();
//        LoginPage loginPage = pageForEntry.goToLogPage();
//        $(loginPage.getLoginBox()).shouldBe(visible);
//        //Assert.assertTrue(loginPage.getLoginBox().isDisplayed());
//        loginPage.fillLoginBox(new User().getLog());
//        $(loginPage.getAccountIcon()).shouldBe(visible);
//        //Assert.assertTrue(loginPage.getAccountIcon().isDisplayed());
//        PasswordPage passwordPage = loginPage.goToPasswordPage();
//        passwordPage.fillPasswordBox(new User().getPass());
//        AccountPage acc = passwordPage.logIn();
//        $(acc.getButtonForNewLetter()).shouldBe(visible);
//        //Assert.assertTrue(acc.getButtonForNewLetter().isDisplayed());
//
//        //Add new contact
//        Logging.log("Add new contact");
//        acc.addContact();
//        $(acc.getName()).shouldBe(visible);
//        //Assert.assertTrue(acc.getName().isDisplayed());
//        acc.fillFieldsInContacts(new NewContact());
//        acc.saveContact();
//        $(acc.getCheckCreation()).shouldHave(exactText(new NewContact().getMail()));
//        //Assert.assertEquals("kost_434@mail.ru", acc.getCheckCreation().getText());
//    }
    @Test
    public void doFirstTest() {
    doContactTest(new FirstContactStategy(), "kost_434@mail.ru");
    }

    @Test
    public void doSecondTest() {
        doContactTest(new SecondContactStrategy(), "minor_97@mail.ru");
    }

    public void doContactTest(ContactsStrategy contactsStrategy, String s) {
        contactsStrategy.createNewContact(driver);
        AccountPage acc = new AccountPage(driver);
        Asser.isTrueForText(acc.getCheckCreation(), s);
        acc.exitFromAcc();
    }
}
