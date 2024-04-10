package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
      ______     __
     / ____/__  / /__  ____  (_)_  ______ ___
     \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
   ___/ /  __/ /  __/ / / / / /_/ / / / / / /
   /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
   ------------------------------------------

*/

/**
 * Класс представляет собой автотест функциональности веб-страницы.
 * Осуществляет переход по различным вкладкам.
 *
 * @author Taron Jarahyan
 * @version 1.0.0
 */

public class Test3 {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер и кликает по различным вкладкам.
     *
     * @param args an array of Strings containing command-line arguments
     */


    public static void main(String[] args) {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.get("https://muztema.ru");      // Открываем главную страницу сайта

        // 1. Клик на вкладку "Каталог"
        WebElement catalogTab = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a"));
        catalogTab.click();

        // 2. Клик на подкаталог "Гитары"
        WebElement guitarsSubCategory = driver.findElement(By.xpath("//*[@id=\"bx_1847241719_1018\"]"));
        guitarsSubCategory.click();

        // 3. Клик на вкладку "Акустические гитары"
        WebElement acousticGuitarsTab = driver.findElement(By.xpath("//*[@id=\"bx_1847241719_1020\"]"));
        acousticGuitarsTab.click();

        // 4. Клик по первой вкладки гитары
        WebElement guitarsTab = driver.findElement(By.xpath("//*[@id='bx_3966226736_369702_7e1b8e3524755c391129a9d7e6f2d206']/div"));
        guitarsTab.click();

        // 5. Клик по вкладке "Характеристики"
        WebElement characteristicsTab = driver.findElement(By.xpath("//*[@id='bx_117848907_369702_tabs']/div/div/ul/li[2]/a"));
        characteristicsTab.click();

        // 6. Находим вкладку "Отзывы" и кликаем на нее
        WebElement reviewsTab = driver.findElement(By.xpath("//*[@id='bx_117848907_369702_tabs']/div/div/ul/li[3]/a"));
        reviewsTab.click();

        // 7. Находим вкладку "Доставка и оплата" и кликаем на нее
        WebElement deliveryPaymentTab = driver.findElement(By.xpath("//*[@id='bx_117848907_369702_tabs']/div/div/ul/li[4]/a"));
        deliveryPaymentTab.click();

        // 8. Находим вкладку "Аналогичные товары" и кликаем на нее
        WebElement similarProductsTab = driver.findElement(By.xpath("//*[@id='bx_117848907_369702_tabs']/div/div/ul/li[5]/a"));
        similarProductsTab.click();
    }
}
