import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    protected static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://otus.ru/");
        System.out.println(driver.getTitle());
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}