package pages.RegisterPage;

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

        } return instance;
    }
}
