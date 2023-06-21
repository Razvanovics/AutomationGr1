package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver114.exe");
        driver = new ChromeDriver();
        String url = "https://demo.automationtesting.in/Index.html";
        driver.get(url);//Methoda care porneste Chrome

        LOG.info("Open Browser Maximized");
        driver.manage().window().maximize();//Methoda care Porneste Chrome in Maximized Window



    }

    public static void tearDown() { //Methoda care inchide browser-ul.
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms) { //Methoda care sa faca pauza intre test case

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl(){
        return "https://demo.automationtesting.in/Index.html";
    }

    public static String getBaseUrl(){ //Methoda in care putem adauga noi in loc de Index.html orice alt link din pagina exemplu Register.html

        String baseurl = returnBaseUrl();
        if (baseurl !=null){
            return baseurl.replace( "Index.html","");

        }
        return baseurl;
    }


}
