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
 * Кликает по ссылкам в разделе "Новости"
 *
 * @author Taron Jarahyan
 * @version 1.0.0
 */

public class Test2 {
    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт и
     * выполняет последовательный клик по различным ссылкам и кнопкам в разделе "Новости".
     *
     * @param args an array of Strings containing command-line arguments
     */

    public static void main(String[] args) {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://muztema.ru");      // Открываем главную страницу сайта

        // 1. Находим вкладку "Новости" и кликаем на нее
        WebElement newsTab = driver.findElement(By.xpath("//*[@id=\"section44\"]/div/div/div[3]/div[1]/h4/a"));
        newsTab.click();

        // 2. Находим ссылку на ежегодную международную выставку Музыка Москва 2023 и кликаем на нее
        WebElement musicMoscow2023Link = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div/div/div[2]/div[2]/div/div/div[1]/span/a"));
        musicMoscow2023Link.click();

        // 3. Находим ссылку на фотоотчет международных выставок и кликаем на нее
        WebElement photoReportLink = driver.findElement(By.xpath("//*[@id=\"bx_1878455859_369287\"]/div[2]/a"));
        photoReportLink.click();

        // 4. Находим ссылку "Возврат к списку" и кликаем на него
        WebElement returnToListLink = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div/div/p/a"));
        returnToListLink.click();

        // 5. Находим кнопку для перехода на главную страницу сайта и кликаем на нее
        WebElement goToHomePageButton = driver.findElement(By.xpath("//*[@id=\"bx_breadcrumb_0\"]/a/span"));
        goToHomePageButton.click();
    }
}