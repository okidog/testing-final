package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cart {
    @Test(priority = 1)
    public void addToCart() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Click fishing category, then go to fishing subcategories (fishing main page)
        driver.findElement(By.id("departmentButton_3074457345616732393")).click();
        Thread.sleep(250);
        driver.findElement(By.id("departmentLink_3074457345616732393")).click();
        Thread.sleep(2500);

        // Find and accept cookies warning so that subcategories are clickable
        driver.findElement(By.id("CookieTrackingDisclosureButton")).click();

        // Click power reels category
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div")).click();
        Thread.sleep(2500);

        // Click Daiwa Tanacom 1200 Electric Reel
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/div[1]/div[6]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[3]/div[3]/div[7]/div/a")).click();
        driver.findElement(By.id("SKU_List_Widget_Add2CartButton_3074457345623450858_table")).click();
        Thread.sleep(7500);

        driver.quit();
    }

    @Test(priority = 2)
    public void removeFromCart() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // First, add item to cart:
        // Click fishing category, then go to fishing subcategories (fishing main page)
        driver.findElement(By.id("departmentButton_3074457345616732393")).click();
        Thread.sleep(250);
        driver.findElement(By.id("departmentLink_3074457345616732393")).click();
        Thread.sleep(2500);

        // Find and accept cookies warning so that subcategories are clickable
        driver.findElement(By.id("CookieTrackingDisclosureButton")).click();

        // Click power reels category
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div")).click();
        Thread.sleep(2500);

        // Click Daiwa Tanacom 1200 Electric Reel, Shop Below, and Add To Cart
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/div[1]/div[6]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[3]/div[3]/div[7]/div/a")).click();
        driver.findElement(By.id("SKU_List_Widget_Add2CartButton_3074457345623450858_table")).click();
        Thread.sleep(6000);

        // Navigate to cart via sidepane
        driver.findElement(By.id("GotoCartButton2")).click();
        Thread.sleep(2500);

        // Click remove
        driver.findElement(By.className("styles_TrashBtn__keBZx")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
