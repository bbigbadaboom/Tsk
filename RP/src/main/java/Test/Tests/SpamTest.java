package Test.Tests;

import Test.BO.User;
import Test.PageFactory.*;
import Test.Utils.Asser;
import Test.Utils.Waiters;
import org.testng.annotations.Test;

public class SpamTest extends BaseClassForTests {

    @Test
    public void testSpam() throws InterruptedException {
        //Go to account
        HomePageForYahoo home = new HomePageForYahoo(driver);
        home.open();
        LoginPage loginPage = home.enterAcc();
        Waiters.waitForElement();

        Asser.isTrue(loginPage.getLoginBox());
        loginPage.fillLoginBox(new User().getLog());

        Asser.isTrue(loginPage.getAccountIcon());
        PasswordPage passwordPage = loginPage.goToPasswordPage();
        passwordPage.fillPasswordBox(new User().getPass());
        AccountPage acc = passwordPage.logIn();

        //Go to income letters and adding to spam
        IncomePage incomePage = acc.getIncomesPage();
        incomePage.addToSpam();
        Thread.sleep(1000);
        SpamPage spamPage = acc.goToSpam();
        Asser.isTrue(spamPage.getCheckLetter());

        //Deleting from spam
        spamPage.deleteFromSpam();
        Thread.sleep(1000);
        incomePage = acc.getIncomesPage();
        Asser.isTrue(incomePage.getCheckIncome());
        acc.exitFromAcc();
    }
}
