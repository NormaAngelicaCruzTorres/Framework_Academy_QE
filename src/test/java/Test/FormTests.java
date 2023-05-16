package Test;

import Step.FormSteps;
import Utilities.reportGenerator;
import Utilities.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class FormTests {
    public WebDriver driver;
    protected reportGenerator report;

    @BeforeSuite
    public void setting() {
        // ChromeDriver location set up in Utils class

        // System.setProperty("webdriver.chrome.driver", utils.UtilsDriver.CHROME_DRIVER_LOCATION);
        // driver = new ChromeDriver();
        //System.setProperty("webdriver.edge.driver", utils.UtilsDriver.FIREFOX_DRIVER_LOCATION);
        // driver = new EdgeDriver();
        System.setProperty("webdriver.firefox.driver", utils.UtilsDriver.FIREFOX_DRIVER_LOCATION);
        driver = new FirefoxDriver();
        driver.get(utils.UtilsDriver.BASE_URL);

        //Report Generator
        this.report = new reportGenerator("submit Web Report");


    }


    @Test(testName = "Submit a WebForm")
    public void submitForm(){

        FormSteps webForm = new FormSteps(driver);
        this.report.setTestName("Submit WebForm");
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJob();
        webForm.pressSubmitButton();
        //webForm.verifyAlertSuccess();
    }

    @AfterMethod
    public void getResult(ITestResult result){
        this.report.getResult(result);
    }

    @AfterSuite
    public void cleanUp(){
        this.report.finishReport();
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
