package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_Page {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By searchBTN = By.xpath("//button[@type='button']");
    private By searchBar= By.id("txt_search_query");
    private By submitBTN= By.id("btn_global_search");

    public Home_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public SearchResults_Page searchForLessons(String lessonName){
        driver.findElement(searchBTN).click();
        driver.findElement(searchBar).sendKeys(lessonName);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(submitBTN)));
        driver.findElement(submitBTN).click();
        return new SearchResults_Page(driver);
    }

}
