package Day_4_Alerts_Frames_Windows_Dropdowns.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab016_NormalAlerts {
    @Test
    void alerts(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
        driver.switchTo().alert().accept();

    }
}
