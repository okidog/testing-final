import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* TODO ---------------------------
    idk scrap this probably
    Figure out new tests, rename module potentially
 */

public class resetPassword {
    public WebDriver driver = new FirefoxDriver();
    public JavascriptExecutor exe = (JavascriptExecutor) driver;

    @Test(priority = 1)
    public void resetPassword() throws InterruptedException {
        // Init driver
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Click account button, then forgot password link
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_links_1")).click();
        Thread.sleep(2000);

        // Send keys to email input, and click Send code
        driver.findElement(By.id("WC_PasswordResetForm_FormInput_logonId_In_ResetPasswordForm_1"))
                .sendKeys("spamforpixelspark@gmail.com");
        driver.findElement(By.id("WC_PasswordResetForm_links_3")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
