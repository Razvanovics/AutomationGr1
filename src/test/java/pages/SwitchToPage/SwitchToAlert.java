package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToAlert extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlert.class); //Mostenirea
    public static SwitchToAlert instance; // Singeltonul

    private SwitchToAlert() {
    }

    public static SwitchToAlert getInstance() { // Methoda prin care facem Clasa Register Page sa fie apelata din Base Test

        if (instance == null) {

            instance = new SwitchToAlert();

        }
        return instance;
    }

    //Locatori
    private By triggerAlertWithOkButton = By.xpath("//button[@onclick='alertbox()']");
    private By alertWithOkAndCancel = By.xpath("//a[@href='#CancelTab']");
    private By triggerAlertConfirmCancel=By.xpath("//button[@class='btn btn-primary']");
    private By cancelConfirmation=By.id("demo");
    private By alertWithTextbox= By.xpath("//a[@href='#Textbox']");
    private By triggerAlertPromptBox=By.xpath("//button[@onclick='promptbox()']");

    public void clickTriggerAlertWithOkButton(){
        LOG.info("Click on'Alert with OK' button");
        driver.findElement(triggerAlertWithOkButton).click();
        driver.switchTo().alert().accept(); // Pentru Pop-op messages nu se pot gasi locatori si folosim aceasta methoda
    }

    public void clickAlertWithOkAndCancel(){
        LOG.info ("Click on 'Alert With Ok And Cancel' tab");
        driver.findElement(alertWithOkAndCancel).click();
    }

    public void clickAlertConfirmCancel(){
        LOG.info ("Click on 'Cancel' button");
        driver.findElement(triggerAlertConfirmCancel).click();
        driver.switchTo().alert().dismiss();
    }

    public String getCancelConfirmationMesage(){
        LOG.info("Confirm getting text from element");
        return driver.findElement(cancelConfirmation).getText();
    }

    public void clickAlertWithTextBox(){
        LOG.info("Click on'Alert with TextBox'");
        driver.findElement(alertWithTextbox).click();
    }

    public void clickAlertTabWithTextBox(String message){
        LOG.info("Click and write message");
        driver.findElement(triggerAlertPromptBox).click();
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }



}