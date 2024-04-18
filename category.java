import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class category {
    public WebDriver driver;

    @Test
    public void categoryDropdownTest() throws InterruptedException {
        // Init driver
        driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Cycle through four different categories
        driver.findElement(By.id("departmentButton_3074457345616732393")).click(); // Fishing
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732410")).click(); // Boating
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732421")).click(); // Shooting
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732432")).click(); // Hunting
        Thread.sleep(4000);
    }

    @Test
    public void categoryMainPages() throws InterruptedException{
        // Click fishing category again, then visit Fishing main page
        driver.findElement(By.id("departmentButton_3074457345616732393")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentLink_3074457345616732393")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        // Now, click Boating category, and visit main page
        driver.findElement(By.id("departmentButton_3074457345616732410")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentLink_3074457345616732410")).click();
        Thread.sleep(3000);

        driver.quit();
    }

}
