package Test;

import Utilities.reportGenerator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Step.FormSteps;
import Utilities.utils;


public class FormTests {
  public EdgeDriver driver ;
  protected reportGenerator report;

  @BeforeSuite
  public void setting() {
    this.report = new reportGenerator("SubmitWebForm");

    // ChromeDriver location set up in Utils class
    //System.setProperty("webdriver.gecko.driver", utils.UtilsDriver.FIREFOX_DRIVER_LOCATION);
    System.setProperty("webdriver.edge.driver", utils.UtilsDriver.EDGE_DRIVER_LOCATION);
    //driver= new FirefoxDriver();
    driver = new EdgeDriver();
    driver.get(utils.UtilsDriver.BASE_URL);

  }

  @Test(testName = "Submit a WebForm")
  public void submitForm() {
    this.report.setTestName("Submit WebForm");
    FormSteps webForm = new FormSteps(driver);
    webForm.implicitWait(10);
    webForm.enterFirstName();
    webForm.enterLastName();
    webForm.enterJob();

    webForm.pressSubmitButton();
    // webForm.verifyAlertSuccess();
  }

  @AfterMethod
  public void getResult(ITestResult result){
    this.report.getResult(result);
  }

  @AfterSuite
  public void cleanUp() {
    this.report.finishReport();
    driver.manage().deleteAllCookies();
    driver.close();
  }
}
