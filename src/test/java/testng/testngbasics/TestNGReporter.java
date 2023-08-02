package testng.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReporter {

    @Test
    public void openBrowser()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        Reporter.log("Open Chrome Browser");
        driver.manage().window().maximize();
    }
}
