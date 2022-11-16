package Test;

import Step.FormSteps;
import Utilities.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class FormTests {
     public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", utils.UtilsDriver.CHROME_DRIVER_LOCATION);
        driver.get(utils.UtilsDriver.BASE_URL);


    }


  @Test(testName = "Submit a WebForm")
  public static void submitForm(){
      FormSteps webForm = new FormSteps();
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJob();
        webForm.pressSubmitButton();
        webForm.verifyAlertSuccess();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
