package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Step.FormSteps;
import Utilities.utils;


public class FormTests {
  public ChromeDriver driver = new ChromeDriver();

  @BeforeSuite
  public void setting() {
    // ChromeDriver location set up in Utils class
    System.setProperty("webdriver.chrome.driver", utils.UtilsDriver.CHROME_DRIVER_LOCATION);
    driver.get(utils.UtilsDriver.BASE_URL);
  }

  @Test(testName = "Submit a WebForm")
  public void submitForm() {
    FormSteps webForm = new FormSteps(driver);
    webForm.enterFirstName();
    webForm.enterLastName();
    webForm.enterJob();
    webForm.pressSubmitButton();
    // webForm.verifyAlertSuccess();
  }

  @AfterSuite
  public void cleanUp() {
    driver.manage().deleteAllCookies();
    driver.close();
  }
}
