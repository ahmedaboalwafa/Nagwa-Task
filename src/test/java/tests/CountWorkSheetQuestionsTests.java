package tests;

import org.testng.annotations.Test;
import pages.Language_Page;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static utilities.LoadData.getData;

public class CountWorkSheetQuestionsTests extends BaseTest{

    @Test
    public void countWorkSheetQuestions() throws IOException {
        Language_Page language_page = new Language_Page(getDriver());
        int count = language_page.openHomePageInEn()
                .searchForLessons(getData("LessonName"))
                .openSecondLesson()
                .openLessonWorkSheetPage()
                .countNumberOfQuestions();

        System.out.println("The questions number is : " + count );
        assertEquals(String.valueOf(count),getData("Count"));
    }
}
