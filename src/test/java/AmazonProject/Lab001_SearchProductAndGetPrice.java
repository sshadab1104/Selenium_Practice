package AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab001_SearchProductAndGetPrice {
    @Test

    public void amazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open Amazon
        driver.get("https://www.amazon.in/");

        // Step 3: Search for Washing Machine
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Washing Machine");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(5000); // wait for results (Better use WebDriverWait)

        // Step 4: Locate Price 26,990
        WebElement price = driver.findElement(
                By.xpath("//span[@class='a-price-whole' and text()='13,990']")
        );

        // Step 5: Print the Price
        System.out.println("Price Found: " + price.getText());

        // Step 6: Close Browser
        driver.quit();
    }
}
