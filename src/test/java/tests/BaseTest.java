package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static utilities.LoadData.getData;

public class BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(getData("URL"));
    }

    public WebDriver getDriver(){
        return driver;
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
