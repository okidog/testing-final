import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* TODO ---------------------------
    Implement going to item from hot items page
 */

public class hotItem {
    public WebDriver driver = new FirefoxDriver();
    public JavascriptExecutor exe = (JavascriptExecutor) driver;
    @BeforeTest
    public void initDriver() throws InterruptedException {
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

    @Test(priority = 1)
    public void hotItemTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Scroll to Hot This Week
        exe.executeScript("window.scroll(0,600)", "");

        // Click through products 6 times for full loop + 1
        for (int i = 0; i <= 5; i++) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/section/div/div[1]/button[2]")).click();
            Thread.sleep(750);
        }

        Thread.sleep(1500);
    }
}
