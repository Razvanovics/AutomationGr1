package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String fName = "Razvan";
    String lName = "Donosa";
    String address = "Strada.Constructorului, nr.1, judetul Covasna, Targu Secuiesc";
    String emailAddress = "razvan.azimut@gmail.com";
    String phoneAddress = "0755 895 845";
    String language = "Romanian";
    String skils = "Java";
    String country = "India";
    String year = "1992";
    String month = "February";
    String day = "21";
    String firstPassword = "BlaBla";
    String secondPassword = "BlaBla";


    @Test
    public void register() {

        driver.get(newUrl);

        LOG.info("Complete the First Name and Last name");
        registerPage.typeFirstName(fName);
        registerPage.typeLastName(lName);

        LOG.info("Complete the Address Field");
        registerPage.typeAddress(address);

        LOG.info("Complete the Phone Address Field");
        registerPage.typeEmailAddress(emailAddress);

        LOG.info("Complete the Phone Address Field");
        registerPage.typePhoneNumber(phoneAddress);


        LOG.info("Complete the Gender on the Gender Field");
        registerPage.clickGenderMaleField();
        registerPage.clickGenderFemaleField();


        LOG.info("Select from Hoobies Checkboxes");
        registerPage.clickCheckBoxCricket();
        registerPage.clickCheckBoxMovies();
        registerPage.clickCheckBoxHockey();


        LOG.info("Select Language Field");
        registerPage.selectLanguage(language);


        LOG.info("Select Skills Field");
        registerPage.selectSkill(skils);


        LOG.info("Select Country");
        registerPage.clickSelectCountry(country);

        LOG.info("Select Birth Date");
        registerPage.birthDate(year,month,day);

        LOG.info("Confirm Password Fields");
        registerPage.confirmPasswordFields(firstPassword,secondPassword);


        sleep(7000);
    }


}
