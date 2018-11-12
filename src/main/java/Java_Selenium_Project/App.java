package Java_Selenium_Project;

import Java_Selenium_Project.BbcSite.BbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\TECH-W114\\Downloads\\chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver ();
        BbcSite bbcSite = new BbcSite (chromeDriver);

        bbcSite.bbcHomePage().goToHomePage ();
        bbcSite.bbcHomePage().clickSignInLink();
        bbcSite.bbcSignInPage ().inputUserName ("email@email.com");
        bbcSite.bbcSignInPage ().inputPassword ("fknsfjapofj");
        bbcSite.bbcSignInPage ().clickSubmitButton ();
        System.out.println (bbcSite.bbcSignInPage ().getPasswordErrorText ());
        bbcSite.quit();




    }
}
