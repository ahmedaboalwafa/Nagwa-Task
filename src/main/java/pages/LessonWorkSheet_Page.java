package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonWorkSheet_Page {
    private WebDriver driver;
    private By questions = By.xpath("//div[@class='instances']//div[(contains(@class,'instance '))]");
    public LessonWorkSheet_Page(WebDriver driver){
        this.driver = driver;
    }

    public int countNumberOfQuestions(){
        return driver.findElements(questions).size();
    }



}
