import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(SimpleTest.class);

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }
    @Test
    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://otus.ru/");
        System.out.println(driver.getTitle());
        logger.info("Ура, открыта страница OTUS!");
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}