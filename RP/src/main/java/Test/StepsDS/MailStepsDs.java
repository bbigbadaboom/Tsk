//package Test.StepsDS;
//
//import Test.BO.Letters.FabricMethod;
//import Test.BO.User;
//import Test.PageFactory.*;
//import Test.Tests.BaseClassForTests;
//import Test.Utils.Asser;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class MailStepsDs extends BaseClassForTests {
//
//    @Given("I opened yahoo")
//    public void openYahoo() {
//        initBrowser();
//        new HomePageForYahoo(driver).open();
//    }
//
//    @When("^I entered account$")
//    public void iEnteredAccount() {
//        new HomePageForYahoo(driver).enterAcc();
//        new LoginPage(driver).fillLoginBox(new User().getLog());
//        PasswordPage passwordPage = new LoginPage(driver).goToPasswordPage();
//        passwordPage.fillPasswordBox(new User().getPass());
//        passwordPage.logIn();
//    }
//
//    @And("^I write a letter$")
//    public void iWriteALetter() {
//        AccountPage acc = new AccountPage(driver);
//        LetterPage letterPage = acc.writeNewMail();
//        letterPage.fillFields(FabricMethod.createFirstLetter());
//    }
//
//    @And("^I save a message$")
//    public void iSaveAMessage() {
//        AccountPage acc;
//        acc = new LetterPage(driver).saveLetter();
//        acc.goToDrafts();
//    }
//
//    @And("^I send a message$")
//    public void iSendAMessage() {
//        new DraftsPage(driver).openLetter();
//        new LetterPage(driver).sendLetter();
//        new AccountPage(driver).goToSends();
//    }
//
//    @Then("^Message with body \"([^\"]*)\" is into sends$")
//    public void messageWithBodyIsIntoSends(String body)  {
//        Asser.isTrueForText(new SendsPage(driver).getBody(), body);
//        //$(new SendsPage(driver).getBody()).shouldHave(exactText(body));;
//    }
//
//    @And("^Exit from account$")
//    public void exitFromAccount() {
//        new AccountPage(driver).exitFromAcc();
//    }
//}
