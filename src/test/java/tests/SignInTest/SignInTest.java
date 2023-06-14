package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest { //Mosteneste din Clasa Best Test
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {

        String email = "grupa1@automation.com"; //
        String password = "parola";

        LOG.info("Check 'Sign In' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed"); //Apelam methoda creata in SignInPage pentru verificare afisare/

        LOG.info("Click button");
        signInPage.clickSignInButton();  //Apelam methoda creata in SignInPage pentru click.

        sleep(3000); //Apelam functia din Clasa BasePage pentru pauza de 3 secunde intre teste

        LOG.info("Check Logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed"); //Apelam methoda creeata in SingInpage pentur verificare Logo

        LOG.info("Click Enter and check if the Invalid Message is Shown"); //Apelam prima oara methoda sa dea Click pe Enter si apoi apleam methoda sa verifice daca mesajul cu Invalid este afisat dupa ce dam click pe Enter
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click Enter and check if the Invalid Message is Shown"); //Apelam din nou mesajul de Invalid deoarece emailul si parola nu st creeate pe Site si verificam negative testing daca functioneaza corect login si nu te poti loga deoarece nu ai cont facut
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");


    }

}