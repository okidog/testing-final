package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/* TODO --------------------------
    Add tests to go to different category main pages
 */

public class category {
    @Test(priority = 1)
    public void categoryTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Cycle through four different categories
        driver.findElement(By.id("departmentButton_3074457345616732393")).click(); // Fishing
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732410")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732421")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732432")).click();
        Thread.sleep(4000);

        driver.quit();
    }

}
