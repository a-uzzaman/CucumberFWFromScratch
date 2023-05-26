package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class setup {
    public static WebDriver driver;

    //This method will be used to instantiate the browser
    public static WebDriver setupBrowser(String browser){
        /*If the browser name is provided as ch, it will instantiate a Chrome browser
          If the browser name is provided as ff, it will instantiate a Firefox browser
          If the browser name is provided as sf, it will instantiate a Safari browser
         */
        if (browser.equalsIgnoreCase("ch")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ff")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("sf")){
            driver = new SafariDriver();
        }

        //Maximize the browser window before test starts
        driver.manage().window().maximize();
        //Wait for elements to load before executing actions
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
