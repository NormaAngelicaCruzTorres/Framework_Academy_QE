package Step;

import org.openqa.selenium.chrome.ChromeDriver;
import Page.FormPages;

public class FormSteps extends FormPages {

  public FormSteps(ChromeDriver driver) {
    super(driver);
  }

  public void enterFirstName() {
    String FIRST_NAME = "Normita";

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
