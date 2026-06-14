package org.testing.selenium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Управление окнами и JavaScript")
class WindowManagementTest extends BaseTest {

    @Test
    @DisplayName("Открытие новой вкладки и переключение между ними")
    void shouldSwitchBetweenTabs() {
        driver.get("https://www.selenium.dev");
        String originalWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");

        assertEquals(2, driver.getWindowHandles().size());

        driver.switchTo().window(originalWindow);
        assertTrue(driver.getCurrentUrl().contains("selenium.dev"));
    }

    @Test
    @DisplayName("Выполнение JavaScript через JavascriptExecutor")
    void shouldExecuteJavaScript() {
        driver.get("https://www.selenium.dev");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = (String) js.executeScript("return document.title");

        assertTrue(title.contains("Selenium"));
    }
}