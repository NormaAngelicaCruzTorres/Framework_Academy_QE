package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPages {
  //protected ChromeDriver driver;

  /*public FormPages(ChromeDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }*/

  protected EdgeDriver driver;
  public FormPages(EdgeDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "first-name")
  public WebElement first_name;

  @FindBy(id = "last-name")
  public WebElement last_name;

  @FindBy(id = "job-title")
  public WebElement RolTrabajo;

  @FindBy(xpath = "//input[@id='radio-button-2']")
  public WebElement college;

  @FindBy(xpath = "//div[5]/div[2]/input")
  public WebElement Male;

  @FindBy(xpath = "//input[@id='checkbox-3']")
  public WebElement pref;

  @FindBy(xpath = "//a[contains(text(),'Submit')]")
  public WebElement submit_button;

  @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
  public WebElement alertSuccess;


  @FindBy(xpath = "//*[contains(concat(@class='sc-product-image')]")
  public WebElement ejemplo;

}
