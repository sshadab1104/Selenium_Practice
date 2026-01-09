package Day_2.Selenium_002_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel_TC_004_SearchBox {
    @Test
    public void searchBox(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        //driver.findElement(By.name("search_query")).sendKeys("QA Automation");
        driver.findElement(By.xpath("//input[@name='search_query']"))
                .sendKeys("QA Automation");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
