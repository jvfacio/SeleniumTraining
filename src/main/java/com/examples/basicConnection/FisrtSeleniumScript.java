package com.examples.basicConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FisrtSeleniumScript {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

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
        driver.navigate().to("https://www.google.com");

        try{
            WebElement element;

            element = driver.findElement(By.id("lst-ib"));

            // 7.1 Send a text.
            element.sendKeys("This is my first selenium script.");

            driver.findElement(By.id("hplogo")).click();
            Thread.sleep(2000);
            // 7.2 Click on search button
            element = driver.findElement(By.name("btnK"));
            element.click();
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
