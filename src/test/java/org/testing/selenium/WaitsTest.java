package org.testing.selenium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("Различные виды ожиданий")
class WaitsTest extends BaseTest {

    @Test
    @DisplayName("WebDriverWait — явное ожидание")
    void explicitWaitShouldWork() {
        driver.get("https://www.selenium.dev");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By link = By.xpath("//a[contains(@href, '/downloads')]");

        assertDoesNotThrow(() ->
            wait.until(ExpectedConditions.elementToBeClickable(link)).click());
    }

    @Test
    @DisplayName("FluentWait — кастомный интервал и игнорирование исключений")
    void fluentWaitShouldIgnoreTemporaryExceptions() {
        driver.get("https://www.selenium.dev");

        FluentWait<?> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        By link = By.xpath("//a[contains(@href, '/downloads')]");

        assertDoesNotThrow(() ->
            wait.until(d -> {
                var el = d.findElement(link);
                return el.isDisplayed() && el.isEnabled() ? el : null;
            }));
    }
}