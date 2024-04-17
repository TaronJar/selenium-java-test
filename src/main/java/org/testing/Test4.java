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
 * Осуществляет поиск по дате во вкладке новостей.
 *
 * @author Taron Jarahyan
 * @version 1.0.0
 */

public class Test4 {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Метод осуществляет поиск по дате "19.09.23" во вкладке новостей и проверяет отображение результатов.
     *
     * @param args an array of Strings containing command-line arguments
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.get("https://muztema.ru");     // Открываем главную страницу сайта

        // 1. Находим вкладку "Новости" и кликаем на нее
        WebElement newsTab = driver.findElement(By.xpath("//*[@id=\"section44\"]/div/div/div[3]/div[1]/h4/a"));
        newsTab.click();

        // 2. Находим поле поиска и вводим дату "19.09.23"
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div/div/div[2]/div[1]/form/div/input"));
        searchField.sendKeys("19.09.23");

        // 3. Нажатие по кнопке поиска
        searchField.submit();

    }
}