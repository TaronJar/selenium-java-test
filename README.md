<div align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/9/9f/Selenium_logo.svg" alt="Selenium" height="100" style="margin: 0 20px;"/>
  <br/>
  <h1>Selenium Java Test</h1>
  <p>Современный пример автоматизированного тестирования веб-приложений</p>

  [![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
  [![Selenium](https://img.shields.io/badge/Selenium-4.44-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
  [![JUnit](https://img.shields.io/badge/JUnit-5.14.4-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
  [![Maven](https://img.shields.io/badge/Maven-3.8-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
  [![License](https://img.shields.io/badge/License-MIT-303030?style=for-the-badge&logo=opensourceinitiative&logoColor=white)](LICENSE)

  <hr/>
</div>

## О проекте

Учебный проект, демонстрирующий современные подходы к автоматизации тестирования.  
Написан на **Java 21 LTS** с использованием **Selenium WebDriver**, **JUnit 5** и **WebDriverManager**.

### Возможности

- ✅ Автоматическое управление драйверами браузеров (никаких ручных скачиваний)
- ✅ Параметризованные тесты с `@ValueSource`
- ✅ Явные ожидания (`WebDriverWait`) и FluentWait
- ✅ Работа с вкладками и выполнение JavaScript
- ✅ Готов к CI/CD (GitHub Actions, Jenkins)

---

## Быстрый старт

### Предварительные требования

- ☕ **Java 21** или выше — [скачать](https://adoptium.net/)
- 📦 **Maven 3.8+** — [скачать](https://maven.apache.org/download.cgi)
- 🌐 **Google Chrome** — [скачать](https://www.google.com/chrome/)

### Установка и запуск

```bash
# Клонирование
git clone https://github.com/TaronJar/selenium-java-test.git
cd selenium-java-test

# Запуск всех тестов
mvn clean test
```

Всё! WebDriverManager автоматически загрузит подходящую версию ChromeDriver.

### Запуск конкретного теста

```bash
mvn test -Dtest=NavigationTest
```

---

## Структура проекта

```
selenium-java-test/
├── pom.xml
├── src/
│   └── test/java/org/testing/selenium/
│       ├── BaseTest.java              # Конфигурация WebDriver
│       ├── WebSearchTest.java         # Поисковые тесты
│       ├── NavigationTest.java        # Тесты навигации
│       ├── WaitsTest.java             # Демонстрация ожиданий
│       └── WindowManagementTest.java  # Вкладки и JS
```

---

## Детальное описание тестов

### 🧱 BaseTest.java

Базовый класс для всех тестов. Выполняет настройку перед каждым тестом и гарантированно закрывает браузер после:

- Настройка ChromeOptions (полноэкранный режим)
- Автоматическая загрузка ChromeDriver через WebDriverManager
- Завершение WebDriver сессии в `@AfterEach`

### 🔍 WebSearchTest.java

Параметризованный тест, демонстрирующий `@ValueSource`:

| Запрос | Что проверяется |
|---|---|
| `Selenium WebDriver` | Заголовок страницы результатов |
| `Java 21` | Заголовок страницы результатов |
| `JUnit 5` | Заголовок страницы результатов |

Подход: ввод текста → отправка формы → ожидание загрузки → валидация.

### 🧭 NavigationTest.java

Два теста для проверки навигации:

1. **Открытие страницы** — проверка URL и title
2. **Переход по ссылке** — ожидание кликабельности → клик → проверка URL

### ⏳ WaitsTest.java

Демонстрация двух стратегий ожидания:

- **WebDriverWait** — явное ожидание до 10 секунд (рекомендуемый подход)
- **FluentWait** — опрос каждые 500ms, игнорирование `NoSuchElementException`

Разница: FluentWait даёт тонкий контроль над частотой опроса и игнорируемыми исключениями.

### 🪟 WindowManagementTest.java

1. **Переключение вкладок** — открытие новой вкладки, `switchTo()`, подсчёт `windowHandles`
2. **JavaScript** — получение `document.title` через `JavascriptExecutor`

---

## Зависимости (pom.xml)

| Артефакт | Версия | Назначение |
|---|---|---|
| `selenium-java` | 4.44.0 | Управление браузером |
| `junit-jupiter` | 5.14.4 | Тестовый фреймворк |
| `webdrivermanager` | 6.3.4 | Авто-управление драйверами |
| `maven-surefire-plugin` | 3.5.6 | Запуск тестов |

---

## Интеграция с CI/CD

### GitHub Actions

```yaml
name: Tests
on: [push]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          java-version: 21
          distribution: temurin
      - run: mvn clean test
```

---

## Полезные ссылки

| Ресурс | Ссылка |
|---|---|
| 📖 Документация Selenium | [selenium.dev](https://www.selenium.dev/documentation/) |
| 📖 Руководство JUnit 5 | [junit.org](https://junit.org/junit5/docs/current/user-guide/) |
| 📖 WebDriverManager | [bonigarcia/webdrivermanager](https://github.com/bonigarcia/webdrivermanager) |
| 📖 Maven Surefire | [maven.apache.org](https://maven.apache.org/surefire/maven-surefire-plugin/) |

---

<div align="center">
  <sub>Сделано с ❤️ для изучения автоматизации тестирования</sub>
</div>