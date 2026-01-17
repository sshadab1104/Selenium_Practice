package Day_4_Alerts_Frames_Windows_Dropdowns.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab018_PromptAlerts {
    @Test
    void promptAlerts(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Shadab");
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
        driver.close();

    }
}
