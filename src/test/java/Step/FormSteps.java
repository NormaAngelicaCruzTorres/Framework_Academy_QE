package Step;

import Page.FormPages;
import Utilities.utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormSteps extends FormPages{

    public void enterFirstName(){
        String FIRST_NAME = "Normita";

        this.first_name.sendKeys(FIRST_NAME);

    }

    public void enterLastName(){

        String LAST_NAME = "Cruz";
        this.last_name.sendKeys(LAST_NAME);

    }

    public void enterJob(){
        String job = "tester";
        this.RolTrabajo.sendKeys(job);


    }

    public void pressSubmitButton(){
        this.submit_button.click();


    }

    public void verifyAlertSuccess(){

        this.alertSuccess.isDisplayed();

    }






}


