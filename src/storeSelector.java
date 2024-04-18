package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/* TODO --------------------------
    Build a test to select different store (PSL?)
 */
public class storeSelector {

    public WebDriver driver;
    public JavascriptExecutor exe;
    @Test(priority = 1)
    public void selectFtMyers() throws InterruptedException {
        // Init driver
        driver = new FirefoxDriver();
        exe = (JavascriptExecutor) driver;
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Click store selector, input zip code, save store
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("storeLocInp"))
                .sendKeys("33966", Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[4]/div[3]/div[1]/div/button")).click();
        Thread.sleep(4000);

    }

    @Test(priority = 2)
    public void selectPSL() throws InterruptedException{
        // Click store selector, input zip code, save store
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("storeLocInp"))
                .sendKeys("34984", Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[4]/div[3]/div[1]/div/button")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void selectFtLauderdale() throws InterruptedException {
        // Click store selector, input zip code, save store
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("storeLocInp"))
                .sendKeys("33301", Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[4]/div[3]/div[1]/div/button")).click();
        Thread.sleep(4000);
    }
}
