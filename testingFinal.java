import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testingFinal {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(1500);

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

        driver.quit();
    }

    @Test(priority = 2)
    public void categoriesTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        Thread.sleep(2500);

        // Cycle through four different categories
        driver.findElement(By.id("departmentButton_3074457345616732393")).click(); // Fishing
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732410")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732421")).click();
        Thread.sleep(500);
        driver.findElement(By.id("departmentButton_3074457345616732432")).click();
        Thread.sleep(1500);

        driver.quit();
    }

    @Test(priority = 3)
    public void subcategoryTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
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

        // Click one sub category, back, then to another
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/div[2]/div")).click();
        Thread.sleep(4000);

        driver.quit();
    }

    @Test(priority = 4)
    public void filterAndSortTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
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

        // Filter to spinning reels, then sort by price descending
        driver.findElement(By.id("maxavailquantity_In Stock")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/div[1]/div[4]/div/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/div[1]/div[4]/div/div/div[2]/div[5]")).click();
        Thread.sleep(5000);

        driver.quit();


    }

    @Test(priority = 5)
    public void storeSelectorTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        Thread.sleep(2500);

        // Click store selector, input zip code, save store
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("storeLocInp"))
                .sendKeys("33031", Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[4]/div[3]/div[1]/div/button")).click();
        Thread.sleep(4000);

        driver.quit();
    }

    @Test(priority = 6)
    public void cartTest() throws InterruptedException {
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
        Thread.sleep(2500);
        exe.executeScript("window.scroll(0,800)","");
        driver.findElement(By.id("SKU_List_Widget_Add2CartButton_3074457345623450858_table")).click();
        Thread.sleep(1500);

        driver.quit();
    }

    @Test(priority = 7)
    public void resetPasswordMailCodeTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(1500);

        // Click account button, then forgot password link
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_links_1")).click();
        Thread.sleep(2000);

        // Send keys to email input, and click Send code
        driver.findElement(By.id("WC_PasswordResetForm_FormInput_logonId_In_ResetPasswordForm_1"))
                .sendKeys("spamforpixelspark@gmail.com");
        driver.findElement(By.id("WC_PasswordResetForm_links_3")).click();
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 8)
    public void hotItemTest() throws InterruptedException {
        // Init driver
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        driver.get("http://basspro.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        // Scroll to Hot This Week
        exe.executeScript("window.scroll(0,600)", "");

        // Click through products 6 times for full loop + 1
        for (int i = 0; i <= 5; i++) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/section/div/div[1]/button[2]")).click();
            Thread.sleep(750);
        }

        Thread.sleep(1500);
        driver.quit();
    }
}
