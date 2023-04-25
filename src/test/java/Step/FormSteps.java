package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page.FormPages;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FormSteps extends FormPages {

  public FormSteps(EdgeDriver driver) {
    super(driver);
  }

  public void enterFirstName() {
    String FIRST_NAME = "Ivonne";
    this.first_name.sendKeys(FIRST_NAME);

  }

  public void enterLastName() {

    String LAST_NAME = "Contreras";
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

//en un implicit wait le digo al robot que se detenga x cantidad de segundos
  public void implicitWait(int seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }

 //ejemplo con expected conditions
  public void visibilityOfElementXpath(String locator){
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
  }

}
