package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults_Page {
    private WebDriver driver;
    private By secondLink = By.xpath("//div[@class='results']//ul//li//a");

    public SearchResults_Page(WebDriver driver){
        this.driver = driver;
    }
    public Lesson_Page openSecondLesson(){
        driver.findElements(secondLink).get(1).click();
        return new Lesson_Page(driver);
    }
}
