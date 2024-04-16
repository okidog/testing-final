import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* TODO --------------------------
    Fix subcategory test to navigate to subcategory mainpage (use hover probably)
    Add testing to sub sub categories (?)
 */

public class subcategory {

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
    public void subcategoryNavigation() throws InterruptedException {
        // Click fishing category, then go to fishing subcategories (fishing main page)
        driver.findElement(By.id("departmentButton_3074457345616732393")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("departmentLink_3074457345616732393")).click();
        Thread.sleep(2500);

        // Find and accept cookies warning so that subcategories are clickable
        driver.findElement(By.id("CookieTrackingDisclosureButton")).click();

        // Click one sub category, back, then to another
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[2]/div")).click();
        Thread.sleep(4000);
    }
}
