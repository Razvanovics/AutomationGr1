package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class); //Mostenirea
    public static RegisterPage instance; // Singeltonul

    private RegisterPage() {
    }

    public static RegisterPage getInstance() { // Methoda prin care facem Clasa Register Page sa fie apelata din Base Test

        if (instance == null) {

            instance = new RegisterPage();

        }
        return instance;
    }

    private By firstName = By.xpath("//input[@placeholder='First Name']");
    private By lastName = By.xpath("//input[@placeholder='Last Name']");
    private By addressField = By.xpath("//textarea[@ng-model='Adress']");
    private By emailAddressField = By.xpath("//input[@type='email']");
    private By phoneNumberField = By.xpath("//input[@type='tel']");
    private By genderMaleField = By.xpath("//input[@value='Male']");
    private By genderFemaleField = By.xpath("//input[@value='FeMale']");
    private By checkBoxCricket = By.id("checkbox1");
    private By checkBoxMovies = By.id("checkbox2");
    private By checkBoxHockey = By.id("checkbox3");



    public void typeFirstName(String fName) { //Methoda ce introduce o valoare in fieldul First Name
        LOG.info("Type First Name in 'First Name' field");
        driver.findElement(firstName).sendKeys(fName);
    }

    public void typeLastName(String lName) { //Methoda ce introduce o valoare in fieldul Last Name
        LOG.info("Type Last Name in 'Last Name' field");
        driver.findElement(lastName).sendKeys(lName);
    }

    public void typeAddress(String adress) { //Methoda ce introduce o valoare in fieldul Last Name
        LOG.info("Type adress in the 'Address' field");
        driver.findElement(addressField).sendKeys(adress);
    }
    public void typeEmailAddress(String emailAddress) { //Methoda ce introduce o valoare in fieldul email Adress
        LOG.info("Type email in the 'Email Address' field");
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }
    public void typePhoneNumber(String phoneNumber) { //Methoda ce introduce o valoare in fieldul email Adress
        LOG.info("Type email in the 'Email Address' field");
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickGenderMaleField() { //Methoda ce selecteaza o valoare in fieldul Gender
        LOG.info("Select Male Gender from Gender field");
        driver.findElement(genderMaleField).click();
    }
    public void clickGenderFemaleField() { //Methoda ce selecteaza o valoare in fieldul Gender
        LOG.info("Select Female Gender from Gender field");
        driver.findElement(genderFemaleField).click();
    }

    public void clickCheckBoxCricket () { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Cricket CheckBox");
        driver.findElement(checkBoxCricket).click();
    }

    public void clickCheckBoxMovies () { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Movies CheckBox");
        driver.findElement(checkBoxMovies).click();
    }
    public void clickCheckBoxHockey () { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Hockey CheckBox");
        driver.findElement(checkBoxHockey).click();
    }
}
