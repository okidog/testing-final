import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* TODO --------------------------
    Import code from previous login funct (check github!)
 */

public class login {

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
    public void loginClubPage() throws InterruptedException {
        // Click club, then click manage account
        driver.findElement(By.id("clubLink")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/nav/ul/li[3]")).click();
        Thread.sleep(2500);

        // Send keys to login boxes
        driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1"))
                .sendKeys("spamforpixelspark@gmail.com");
        driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1"))
                .sendKeys("GeorgeForeman1", Keys.ENTER);
        Thread.sleep(5000);

    }
}