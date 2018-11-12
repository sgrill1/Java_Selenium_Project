package Java_Selenium_Project.BbcSite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomePage {
    private WebDriver driver;

    private String homePageUrl = "https://www.bbc.co.uk/";
    private By SignInLinkID = By.id ("idcta-link");

    public BbcHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.navigate ().to (homePageUrl);
    }
//    public void clickSignInLink(){
//        driver.findElement (By.id ("idcta-link")).click ();

    public void clickSignInLink() {
        driver.findElement (SignInLinkID).click ();
    }

}
