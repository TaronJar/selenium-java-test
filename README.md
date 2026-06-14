# Selenium Java Test

Пример автоматизированного тестирования веб-приложений с использованием **Selenium WebDriver**, **JUnit 5** и **WebDriverManager**.

---

## Стек технологий

| Инструмент | Назначение |
|---|---|
| **Java 17** | Язык программирования |
| **Selenium WebDriver 4.30** | Управление браузером |
| **JUnit 5.12** | Фреймворк для тестирования |
| **WebDriverManager 5.9** | Автоматическое управление драйверами браузеров |
| **Maven** | Сборка и управление зависимостями |

---

## Структура проекта

```
selenium-java-test/
├── pom.xml                          # Зависимости и конфигурация сборки
├── src/
│   └── test/java/org/testing/selenium/
│       ├── BaseTest.java            # Базовый класс с настройкой WebDriver
│       ├── WebSearchTest.java       # Параметризованные поисковые тесты
│       ├── NavigationTest.java      # Тесты навигации и ссылок
│       ├── WaitsTest.java           # Демонстрация WebDriverWait и FluentWait
│       └── WindowManagementTest.java# Управление вкладками и JavaScript
```

---

## Быстрый старт

### Требования

- Java 17 или выше
- Maven 3.8+
- Google Chrome (последняя версия)

### Запуск

```bash
git clone https://github.com/TaronJar/selenium-java-test.git
cd selenium-java-test
mvn clean test
```

WebDriverManager сам скачает подходящий ChromeDriver — ничего устанавливать вручную не нужно.

### Запуск одного теста

```bash
mvn test -Dtest=NavigationTest
```

---

## Описание тестов

### BaseTest
Абстрактный базовый класс. Настраивает ChromeDriver через WebDriverManager, максимизирует окно перед каждым тестом и закрывает браузер после.

### WebSearchTest
Параметризованный тест (`@ValueSource`). Ищет в Google разные запросы и проверяет заголовок страницы результатов.

### NavigationTest
Открывает selenium.dev, проверяет URL и заголовок, переходит по ссылке на страницу загрузок.

### WaitsTest
Два подхода к ожиданиям:
- **WebDriverWait** — явное ожидание до 10 секунд
- **FluentWait** — кастомный интервал (500ms), игнорирование NoSuchElementException

### WindowManagementTest
- Переключение между вкладками браузера
- Выполнение JavaScript через JavascriptExecutor

---

## Полезные ссылки

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
