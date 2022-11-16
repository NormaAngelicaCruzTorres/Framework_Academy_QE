package Utilities;

// Todas las páginas de prueba heredan de esta clase

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class utils {

    public WebDriver driver;
    protected WebElement webElement;

    public utils(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static class UtilsDriver {

        public static String BASE_URL = "https://formy-project.herokuapp.com/form";
        public static String CHROME_DRIVER_LOCATION = "chromedriver";
    }

}