package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage { //Mosteneste din Clasa Best Tesst;  extends este mostenirea in Java
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By.id("btn1"); //Identificat Locator unic sa verificam daca Buton SignIn e afisat in pagin; "By" e comanda in Selenium
    private By logo = By.id("logo");//Locator logo site
    private By signInEmailField = By.xpath("//input[@placeholder='E mail']"); // Locator xpath email field ( daca valoarea "este cu ghilimele se pune apostrof in InteliJ
    private By signInPasswordField = By.xpath("//input[@placeholder='Password']"); //Locator xpath password field
    private By enterButton = By.id("enterbtn"); // Locator Button Enter
    private By errorMsg = By.id("errormsg"); // Locator vizibil dupa ce dam Enter fara sa completam Email si Password Field


    public boolean isSignInButtonDisplayed() { //Methoda Locator, daca e afisat pe site buttonul btn1 de pe site
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }


    public void clickSignInButton() { // Method ce da click pe btn1
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isLogoDisplayed() { //Methoda ce verifica daca e afisat Logo
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public void typeInSignInEmailField(String email) { //Methoda ce introduce o valoare in Stringul email(cand o sa fie definit)
        LOG.info("Type email address in 'E mail' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password) { //Methoda ce introduce o valuare in Stringul password
        LOG.info("Type email address in 'Password' field");
        driver.findElement(signInEmailField).sendKeys(password);
    }

    public void clickEnterButton() { //Methoda click Enter Button
        LOG.info("Click 'Enter' Button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() { // Methoda verificare existenta mesaj Invalid User name ce apare dupa ce dam clicl pe Enter cu fieldurile goale la email si parola
        LOG.info("Verifying if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();

    }

}


