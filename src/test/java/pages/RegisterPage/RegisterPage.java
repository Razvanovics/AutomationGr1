package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    private By chooseFieldLanguage = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    String selectSkill = "Skills";
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By searchField = By.xpath("//input[@type='search']");
    private By birthYear = By.id("yearbox");
    private By birthMonth = By.xpath("//select[@placeholder='Month']");
    private By birthDay = By.id("daybox");
    private By firstPassword = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");
    private By chooseFileButton = By.id("imagesrc");
    private By confirmLogoImage = By.id("imagetrgt");
    private By submitButton = By.id("submitbtn");


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

    public void clickCheckBoxCricket() { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Cricket CheckBox");
        driver.findElement(checkBoxCricket).click();
    }

    public void clickCheckBoxMovies() { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Movies CheckBox");
        driver.findElement(checkBoxMovies).click();
    }

    public void clickCheckBoxHockey() { //Method ce selecteaza checkbox-ul Cricket
        LOG.info("Select Hockey CheckBox");
        driver.findElement(checkBoxHockey).click();
    }

    public void selectLanguage(String language) { //Methoda ce selecteaza Language
        LOG.info("Select Language ");
        driver.findElement(chooseFieldLanguage).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click(); //Methoda ce inseareaza specific language cu o valoare din lista afisata pe site ca limbi
    }

    public void selectSkill(String skill) { //Methoda ce selecteaza o valoare din cadrul unui drop down pentru Skils
        LOG.info("Select Skills");
        Select newskills = new Select(driver.findElement(By.id(selectSkill)));
        newskills.selectByValue(skill);
    }

    public void clickSelectCountry(String country) { //Methoda ce selecteaza Country Field sa putem selecta apoi tara
        LOG.info("Click on Country Field");
        driver.findElement(selectCountry).click();
        driver.findElement(searchField).sendKeys(country);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

    public void birthDate(String year, String month, String day) {
        LOG.info("Select Brithdate");
        Select birthYearDate = new Select(driver.findElement(birthYear));
        birthYearDate.selectByValue(year);
        Select birthMonthDate = new Select(driver.findElement(birthMonth));
        birthMonthDate.selectByValue(month);
        Select birthDayDate = new Select(driver.findElement(birthDay));
        birthDayDate.selectByValue(day);
    }

    public void confirmPasswordFields(String password, String confirmPassword) {

        LOG.info("Enter First password");
        driver.findElement(firstPassword).sendKeys(password);
        driver.findElement(secondPassword).sendKeys(confirmPassword);

    }

    public void chooseFileButtonUpload() {
        LOG.info("Click Choose File Button to open Windows Explorer");
        WebElement chooseFile=driver.findElement(chooseFileButton);
        chooseFile.sendKeys("C:\\Users\\Razvanovics\\Downloads\\Azimut File Upload\\Mreana.jpg"); //Exemplu de la curs este mai ok pentru Scalabilitate
//        driver.findElement(chooseFileButton).sendKeys("C:\\Users\\Razvanovics\\Downloads\\Azimut File Upload\\Mreana.jpg"); //Asta e ce am scris eu ca optiune
    }

    public void clickSubmitButton() {
        LOG.info("Click Submit Button");
        driver.findElement(submitButton).click();
    }

}
