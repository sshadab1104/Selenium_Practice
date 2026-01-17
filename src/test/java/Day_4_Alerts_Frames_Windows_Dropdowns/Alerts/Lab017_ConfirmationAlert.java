package Day_4_Alerts_Frames_Windows_Dropdowns.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab017_ConfirmationAlert {
    @Test
    void confAlert(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']")).click();
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
    }
}
