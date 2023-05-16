package Step;

import Page.FormPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.Normalizer;

public class FormSteps extends FormPages {


    public FormSteps(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName() {
        String FIRST_NAME = "Norma";
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName() {

        String LAST_NAME = "Cruz";
        this.last_name.sendKeys(LAST_NAME);

    }

    public void enterJob() {
        String job = "tester";
        this.RolTrabajo.sendKeys(job);


    }

    public void pressSubmitButton() {
        this.submit_button.click();


    }

    public void verifyAlertSuccess() {

        this.alertSuccess.isDisplayed();

    }

}