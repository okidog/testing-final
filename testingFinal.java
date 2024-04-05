import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testingFinal { /*
    @Test(priority = 1)
    public void login() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        Thread.sleep(1500);

        // Click account button, submit credentials and login
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/a/span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1\"]"))
                .sendKeys("spamforpixelspark@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1\"]"))
                .sendKeys("GeorgeForeman1", Keys.ENTER);
        Thread.sleep(10000);
    } */

    @Test(priority = 2)
    public void categoriesTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        Thread.sleep(1500);

    }
}
