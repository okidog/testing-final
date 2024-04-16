import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* TODO --------------------------
    (Possibly) Figure out more tests to perform with this module
 */

public class category {
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
    public void categoryTest() throws InterruptedException {
        // Cycle through four different categories
        driver.findElement(By.id("departmentButton_3074457345616732393")).click(); // Fishing
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732410")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732421")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732432")).click();
        Thread.sleep(4000);
    }

}
