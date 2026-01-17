package Day_3_WebElement_Actions_Waits.Part_1_WebElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab008_WebElementMethods {
    @Test
    void methods(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).clear();
        System.out.println(driver.findElement(By.className("lnXdpd")).getText());
        driver.close();
    }
}
