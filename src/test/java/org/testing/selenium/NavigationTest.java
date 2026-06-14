package org.testing.selenium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Навигация по страницам")
class NavigationTest extends BaseTest {

    @Test
    @DisplayName("Открытие страницы и проверка заголовка с URL")
    void shouldOpenPageAndVerifyTitle() {
        driver.get("https://www.selenium.dev");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Selenium"));

        assertTrue(driver.getTitle().contains("Selenium"));
        assertEquals("https://www.selenium.dev/", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Переход по ссылке и проверка URL")
    void shouldNavigateToDownloadsPage() {
        driver.get("https://www.selenium.dev");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By link = By.xpath("//a[contains(@href, '/downloads')]");

        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
        wait.until(ExpectedConditions.urlContains("downloads"));

        assertTrue(driver.getCurrentUrl().contains("downloads"));
    }
}