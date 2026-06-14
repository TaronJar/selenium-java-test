package org.testing.selenium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Поисковые запросы в Google")
class WebSearchTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"Selenium WebDriver", "Java 17", "JUnit 5"})
    @DisplayName("Поиск и проверка заголовка")
    void googleSearchReturnsResults(String query) {
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By searchBox = By.name("q");

        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        driver.findElement(searchBox).sendKeys(query + Keys.ENTER);

        wait.until(ExpectedConditions.titleContains(
            query.substring(0, Math.min(query.length(), 10))));

        String title = driver.getTitle();
        assertTrue(title.toLowerCase().contains(query.substring(0, 5).toLowerCase()),
            "Заголовок должен содержать начало запроса: " + query);
    }
}