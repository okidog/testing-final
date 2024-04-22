import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class subcategory {
    public WebDriver driver;
    public Actions action;
    @Test
    public void subcategoryNavigation() throws InterruptedException {
        // Init driver
        driver = new FirefoxDriver();
        action = new Actions(driver);
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Click fishing category, then go to fishing subcategories (fishing main page)
        driver.findElement(By.id("departmentButton_3074457345616732393")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("departmentLink_3074457345616732393")).click();
        Thread.sleep(2500);

        // Find and accept cookies warning so that subcategories are clickable
        driver.findElement(By.id("CookieTrackingDisclosureButton")).click();

        // Click one sub category, back, then to another
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/a/h2")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2500);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[2]/div"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[2]/div/a/h2")).click();
        Thread.sleep(4000);
    }

    @Test
    public void subcategoryNavlinks() throws InterruptedException {
        // Come back to fishing category page
        driver.navigate().back();
        Thread.sleep(1500);

        // Hover over fishing category, click Baitcast Reels, return
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/ul/li[1]/a")).click();
        Thread.sleep(2500);
        driver.navigate().back();

        // Hover over fishing category, click Spincast Reels
        Thread.sleep(3000);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/ul/li[3]/a")).click();
        Thread.sleep(2500);

        driver.quit();
    }
}
