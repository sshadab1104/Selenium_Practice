package Day_4_Alerts_Frames_Windows_Dropdowns.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab019_P1 {
    @Test
    void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement btn = driver.findElement(By.id("alertButton"));
        btn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
    @Test
    void test_1(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");
        WebElement btn = driver.findElement(By.id("timerAlertButton"));
        btn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
    @Test
    void test_2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();
    }
}
