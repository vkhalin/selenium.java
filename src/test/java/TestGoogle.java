import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIS;

public class TestGoogle {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start()  {
        driver = new ChromeDrievr();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testGoogle() {
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findELement(By.name("btnK")).click();
        wait.until(titleIS("webdriver - Search in Google"));

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}
