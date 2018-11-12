package Java_Selenium_Project.BbcSite;

import Java_Selenium_Project.BbcSite.BbcPages.BbcHomePage;
import Java_Selenium_Project.BbcSite.BbcPages.BbcSignInPage;
import org.openqa.selenium.WebDriver;
public class BbcSite {

    private
    WebDriver driver;
    BbcHomePage bbcHomePage;
    BbcSignInPage bbcSignInPage;

    public BbcSite(WebDriver driver){
        this.driver = driver;
        bbcSignInPage = new BbcSignInPage(driver);
        bbcHomePage = new BbcHomePage(driver);

    }

    //Page Accessors
    public BbcHomePage bbcHomePage(){
        return bbcHomePage;
    }

    public void quit(){
        driver.quit ();
    }

    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }

    //Helpers
    public String getCurrentURL(){
        return driver.getCurrentUrl ();
    }

}
