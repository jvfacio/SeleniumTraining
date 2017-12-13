package com.examples.basicConnection;

import com.examples.basicConnection.utils.ConstantsPracticeOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PracticeOne {


    public static void main(String[] args) {


        // 1. Select the browser to run
        // (whichBrowserDriverToUse, setTheDriverPath)
        // Chrome
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\webdrivers\\chromedriver.exe");

        // Firefox (Gecko driver)
        // System.setProperty("webdriver.gecko.driver", "D:\\Training\\Selenium\\Course 2017\\Drivers\\geckodriver.exe");

        // 2. Open the browser --> WebDriver
        // this is for chrome
        WebDriver driver;

        // 3. set options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");

        // 4. Release a driver without options
        //driver = new ChromeDriver();

        // 4. Release a driver with options
        driver = new ChromeDriver(options);

        // Firefox
        // driver = new FirefoxDriver();
        // driver.manage().window().maximize();


        // 5. Navigate to a page
        driver.navigate().to(ConstantsPracticeOne.URL);

        try{
            WebElement element;

            element = driver.findElement(By.id("menu-item-374"));
            element.click();


            element = driver.findElement(By.id("name_3_firstname"));
            element.sendKeys("Josue");

            element = driver.findElement(By.id("name_3_lastname"));
            element.sendKeys("Vazquez");


            element = driver.findElement(By.xpath("//*[@name='radio_4[]'][1]"));
            element.click();

            element = driver.findElement(By.xpath("//*[@name='radio_4[]'][2]"));
            element.click();

            element = driver.findElement(By.xpath("//*[@name='checkbox_5[]'][2]"));

            element.click();

            element = driver.findElement(By.id("dropdown_7"));
            Select select = new Select(element);
            Thread.sleep(2000);
            select.selectByValue("Algeria");
            Thread.sleep(2000);
            select.selectByIndex(1);
            Thread.sleep(2000);
            select.selectByVisibleText("Mexico");
            Thread.sleep(2000);

            


        }
        catch (WebDriverException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }

        // Find the text box for searching


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // 8. Close the browser
        // Close and Quit
        driver.quit();

    }
}
