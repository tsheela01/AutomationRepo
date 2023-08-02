package testng.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCrossBrowser {

  WebDriver driver;

    @Parameters("browser")
    @Test
    public void openBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome"))
            driver = new ChromeDriver();
        if (browser.equalsIgnoreCase("firefox"))
            driver = new FirefoxDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void shutBrowser() {
        driver.quit();
    }
}
