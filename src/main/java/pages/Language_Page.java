package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Language_Page {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    //private By englishLink=By.linkText("English");   //the link locator not work
    private By englishLink=By.xpath("//ul//li//a");

    public Language_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public Home_Page openHomePageInEn(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(englishLink)));
        //driver.findElement(englishLink).click();

        driver.findElements(englishLink).get(0).click();
        return new Home_Page(driver);
    }
}
