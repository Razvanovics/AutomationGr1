package tests.SwitchToPageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SwitchToPage.SwitchToAlert;
import tests.BaseTest;

import static pages.BasePage.*;

public class SwitchToAlertTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlert.class);
    private String newUrl = getBaseUrl() + "Alerts.html";

    String cancelMessage = "You Pressed Cancel";


    @Test
    public void switchToAlertTest() {
        driver.get(newUrl);

        LOG.info("Click on'Alert with OK' button");
        sleep(1000);
        switchToAlertPage.clickTriggerAlertWithOkButton();

        LOG.info("Click on 'Alert With Ok And Cancel' tab");
        switchToAlertPage.clickAlertWithOkAndCancel();

        LOG.info("Click on 'Cancel' button");
        switchToAlertPage.clickAlertConfirmCancel();
        String cancelMessageConfirmation = switchToAlertPage.getCancelConfirmationMesage(); // Comparatie intre valorile definite pe variabila de mai sus, valoarea fiind textul ce dorim sa il confirmam gasit in elementul paginii
        Assert.assertEquals(cancelMessage,cancelMessageConfirmation,"The values are not equal");

        LOG.info("Click on'Alert with TextBox'");
        switchToAlertPage.clickAlertWithTextBox();

        LOG.info("Click and write message");
        switchToAlertPage.clickAlertWithTextBox();


        sleep(3000);
    }
}