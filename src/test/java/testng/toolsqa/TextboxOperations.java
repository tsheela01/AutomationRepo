package testng.toolsqa;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class TextboxOperations
{
    WebDriver driver;

    @BeforeTest (groups = { "TextBoxCases" })
    public void openBrowser()
    {
        driver = new ChromeDriver();
        Reporter.log("We used Google Chrome Ver 80 for this test");
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String pageTitle = driver.getTitle();
        //Hard assert
        Assert.assertEquals(pageTitle, "DEMOQA1", "Title do not match");
    }

    @Test (groups = { "TextBoxCases" })
    public void navigateToElementTextBoxPage()
    {
        WebElement elements = driver.findElement(By.xpath("//*[text()='Elements']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        elements.click();
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
    }

    @Test (groups = { "TextBoxCases" })
    public void submitTextBox()
    {
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Test User");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("testuser@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("12 York Street");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Mayur Vihar 1");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();
    }
}