package org.testing;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Web page testing class.
 * @version 1.0.0
 * @autor TaronJarahyan
 */
public class Test1 {

    /*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

    */

    /**
     * The method opens the page and checks its title in the browser.
     * @throws MalformedURLException
     */
    @Test
    public void test1() throws MalformedURLException {

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        // Create a new driver instance.
        WebDriver driver;
        driver = new RemoteWebDriver(new URL("http://192.168.99.1:4444/wd/hub"), capability);
        driver.manage().window().maximize();
        // Opening a page in the browser.
        driver.get("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley");
        // Check the page title.
        System.out.println("Title of the page is " + driver.getTitle());
        // After the test you need to close the browser.
        driver.quit();
    }
}