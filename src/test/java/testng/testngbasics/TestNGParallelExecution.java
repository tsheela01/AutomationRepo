package testng.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParallelExecution {
    WebDriver driver;

    @Test
    public void ChromeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test
    public void FirefoxTest() {
        driver = new FirefoxDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
