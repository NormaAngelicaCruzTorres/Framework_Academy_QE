package Step;

import Page.FormPages;
import Utilities.reportGenerator;
import org.openqa.selenium.WebDriver;


public class FormSteps extends FormPages {

    protected reportGenerator report;
    public FormSteps(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName() {
        String FIRST_NAME = "Enter you first name";
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName() {
        String LAST_NAME = "Enter you last name";
        this.last_name.sendKeys(LAST_NAME);

    }

    public void enterJob() {
        String job = "Enter you Job";
        this.RolTrabajo.sendKeys(job);


    }

    public void pressSubmitButton() {
        this.submit_button.click();


    }

    public void verifyAlertSuccess() {

        this.alertSuccess.isDisplayed();

    }

}