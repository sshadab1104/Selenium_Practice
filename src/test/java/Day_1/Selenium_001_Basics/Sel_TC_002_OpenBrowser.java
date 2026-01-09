package Day_1.Selenium_001_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel_TC_002_OpenBrowser {
    @Test
    public void openBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.close();
    }
}
