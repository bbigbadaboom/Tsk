package Test.Tests;//package Test.Tests;
//
//import Test.BO.Letters.FabricMethod;
//import Test.BO.User;
//import Test.PageFactory.*;
//import Test.Utils.Logging;
//import org.testng.annotations.Test;
//
//import static com.codeborne.selenide.Condition.exactText;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selenide.$;
//
//public class MailTest extends BaseClassForTests {
//
//    @Test
//    public void testMail() {
//        //Log to account
//        HomePageForYahoo home = new HomePageForYahoo(driver);
//        Logging.log("Login to account");
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
//        //Write a new letter
//        Logging.log("Witting a new letter");
//        LetterPage letterPage = acc.writeNewMail();
//        letterPage.fillFields(FabricMethod.createFirstLetter());
//
//        //Save letter as draft
//        Logging.log("Saving as draft");
//        acc = letterPage.saveLetter();
//        DraftsPage draftsPage = acc.goToDrafts();
//
//        //Verify letter
//        Logging.log("Verify letter");
//        $(draftsPage.getTheme()).shouldHave(exactText("Letter"));
//        //Assert.assertEquals("Letter", draftsPage.getTheme().getText());
//        $(draftsPage.getBody()).shouldHave(exactText("Hello max"));
//        //Assert.assertEquals("Hello max", draftsPage.getBody().getText());
//        letterPage = draftsPage.openLetter();
//
//        //Send letter
//        Logging.log("Send letter");
//        acc = letterPage.sendLetter();
//        $(draftsPage.getEmtyDrafts()).shouldBe(visible);
//        //Assert.assertTrue(draftsPage.getEmtyDrafts().isDisplayed());
//        SendsPage sendsPage = acc.goToSends();
//        $(sendsPage.getBody()).shouldHave(exactText("Hello max"));
//        Assert.assertEquals("Hello max", sendsPage.getBody().getText());
//
//    }
//}
