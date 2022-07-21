package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lesson_Page {
    private WebDriver driver;
    private By workSheetLink = By.partialLinkText("Lesson Worksheet");
    public Lesson_Page(WebDriver driver){
        this.driver = driver;
    }

    public LessonWorkSheet_Page openLessonWorkSheetPage(){
        driver.findElement(workSheetLink).click();
        return new LessonWorkSheet_Page(driver);
    }
}
