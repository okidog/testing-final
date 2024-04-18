import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class resetPassword {
    @Test(priority = 1)
    public void resetPassword() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
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

    @Test(priority = 2)
    public void resetViaDedicatedLogin() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Click club, then click manage account
        driver.findElement(By.id("clubLink")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/nav/ul/li[3]")).click();
        Thread.sleep(2500);

        // Click forgot password link
        driver.findElement(By.id("WC_AccountDisplay_links_1")).click();

        // Send keys to email input, and click Send code
        driver.findElement(By.id("WC_PasswordResetForm_FormInput_logonId_In_ResetPasswordForm_1"))
                .sendKeys("spamforpixelspark@gmail.com");
        driver.findElement(By.id("WC_PasswordResetForm_links_3")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
