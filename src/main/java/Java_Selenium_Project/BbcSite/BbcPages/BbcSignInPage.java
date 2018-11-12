package Java_Selenium_Project.BbcSite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {
    private WebDriver driver;
    private String signInPageURL = "https://account.bbc.com/signin";

    private By usernameFieldID = By.id("user-identifier-input");
    private By passwordFieldID = By.id("password-input");
    private By submitButtonID = By.id("submit-button");
    private By incorrectPasswordErrorID = By.id("form-message-password");

    public BbcSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate ().to (signInPageURL);
    }

    public void inputUserName(String name){
        driver.findElement(usernameFieldID).sendKeys(name);
    }

    public void inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonID).click ();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorID).getText();
    }

    //Page Assertion
    //    public void AssertCurrentURLIsSignInPage(){
    //        Assert
    //    }


}
