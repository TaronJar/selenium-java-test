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
 * Осуществляет поиск продукта, добавление его в корзину,
 * переход в корзину и оформления заказа.
 *
 * @author Taron Jarahyan
 * @version 1.0.0
 */

public class Test1 {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, выполняет поиск продукта, добавляет его в корзину,
     * открывает корзину и переходит к оформлению заказа.
     *
     * @param args an array of Strings containing command-line arguments
     * @throws InterruptedException if any thread has interrupted the current thread
     */

    public static void main(String[] args) throws InterruptedException {

        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://muztema.ru");      // Открываем главную страницу сайта

        // 1. Находим поле для поиска и вводим запрос "Soundking DE017"
        WebElement searchInputField = driver.findElement(By.xpath("//*[@id=\"title-search-input\"]"));
        searchInputField.sendKeys("Soundking DE017");
        searchInputField.submit();

        // 2. Находим кнопку "Купить" и кликаем на нее
        WebElement buyButton = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_369672_7e1b8e3524755c391129a9d7e6f2d206_buy_link\"]"));
        buyButton.click();

        // 3. Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(300);

        // 4. Находим кнопку "Перейти в корзину" и кликаем на нее
        WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"CatalogSectionBasket_bx_3966226736_369672_7e1b8e3524755c391129a9d7e6f2d206\"]/div[3]/span"));
        goToCartButton.click();

        // 5. Находим кнопку "Оформить заказ" и кликаем на нее
        WebElement checkoutButton = driver.findElement(By.xpath("//*[@id=\"basket-root\"]/div[1]/div/div/div[2]/div/div[3]/button"));
        checkoutButton.click();
    }
}
