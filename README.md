<div align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/9/9f/Selenium_logo.svg" alt="Selenium" height="100" style="margin: 0 20px;"/>
  <br/>
  <p>Учебный проект по автоматизации тестирования</p>

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
- 🌐 **Google Chrome** — [скачать](https://www.google.com/chrome/)
- 📦 **Maven 3.8+** — нужен только если запускаешь через терминал вручную.  
  В IntelliJ IDEA Maven уже встроен. [Скачать Maven](https://maven.apache.org/download.cgi)

### Установка и запуск (через терминал)

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

<details>
<summary><b>🖥️ Установка и запуск в IntelliJ IDEA</b></summary>

<br/>

Самый простой способ для новичка.

### Шаг 1. Скачать и установить IntelliJ IDEA

1. Перейти на [jetbrains.com/idea/download](https://www.jetbrains.com/idea/download/)
2. Скачать **Community Edition** (бесплатная)
3. Установить, запустить

### Шаг 2. Установить Java 21

1. Перейти на [adoptium.net](https://adoptium.net/)
2. Скачать **JDK 21 (LTS)** для своей ОС
3. Установить

### Шаг 3. Открыть проект

> Maven устанавливать не нужно — он уже встроен в IntelliJ IDEA.

1. Открыть IntelliJ IDEA
2. Нажать **File → New → Project from Version Control**
3. Вставить URL: `https://github.com/TaronJar/selenium-java-test.git`
4. Нажать **Clone**
5. IDEA сама обнаружит Maven-проект и скачает все зависимости (подождать)

### Шаг 4. Запустить тест

**Вариант A — через IDE:**
- Открыть `src/test/java/org/testing/selenium/NavigationTest.java`
- Нажать зелёный треугольник (Run) слева от названия класса
- Выбрать **Run 'NavigationTest'**

**Вариант B — через терминал внутри IDEA:**
- Открыть встроенный терминал (Alt+F12)
- Написать `mvn clean test`

✅ Если тесты прошли — всё работает!

</details>

<details>
<summary><b>🖥️ Установка и запуск в VS Code</b></summary>

<br/>

### Шаг 1. Установить VS Code

1. Перейти на [code.visualstudio.com](https://code.visualstudio.com/)
2. Скачать и установить

### Шаг 2. Установить Java 21

Скачать и установить JDK 21 c [adoptium.net](https://adoptium.net/)

### Шаг 3. Установить расширения

Открыть VS Code → вкладка **Extensions** (Ctrl+Shift+X) → установить:

- **Extension Pack for Java** (Microsoft) — всё для Java
- **Maven for Java** (Microsoft) — поддержка Maven

> Maven должен быть установлен отдельно (см. раздел «Предварительные требования»).  
> VS Code использует системный Maven из PATH.

### Шаг 4. Открыть проект

1. **File → Open Folder**
2. Выбрать папку `selenium-java-test`
3. Подождать, пока VS Code загрузит зависимости

### Шаг 5. Запустить тест

- Открыть `NavigationTest.java`
- Нажать **Run** (или Ctrl+F5)

</details>

<details>
<summary><b>❓ Возможные проблемы</b></summary>

<br/>

| Проблема | Решение |
|---|---|
| `Java not found` | Проверь, что Java 21 установлена: `java -version` в терминале |
| `Maven not found` | Проверь Maven: `mvn --version`. Добавь `bin` в PATH |
| `ChromeDriver error` | Убедись, что Google Chrome установлен. WebDriverManager подберёт драйвер сам |
| Зависимости не скачались | `mvn clean install -U` — принудительно обновить |

</details>

<details>
<summary><b>📁 Структура проекта</b></summary>

<br/>

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

</details>

<details>
<summary><b>🧪 Детальное описание тестов</b></summary>

<br/>

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

</details>

<details>
<summary><b>📦 Зависимости (pom.xml)</b></summary>

<br/>

| Артефакт | Версия | Назначение |
|---|---|---|
| `selenium-java` | 4.44.0 | Управление браузером |
| `junit-jupiter` | 5.14.4 | Тестовый фреймворк |
| `webdrivermanager` | 6.3.4 | Авто-управление драйверами |
| `maven-surefire-plugin` | 3.5.6 | Запуск тестов |

</details>

<details>
<summary><b>🔄 Интеграция с CI/CD</b></summary>

<br/>

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

</details>

---

## Полезные ссылки

| Ресурс | Ссылка |
|---|---|
| 📖 Документация Selenium | [selenium.dev](https://www.selenium.dev/documentation/) |
| 📖 Руководство JUnit 5 | [junit.org](https://junit.org/junit5/docs/current/user-guide/) |
| 📖 WebDriverManager | [bonigarcia/webdrivermanager](https://github.com/bonigarcia/webdrivermanager) |
| 📖 Maven Surefire | [maven.apache.org](https://maven.apache.org/surefire/maven-surefire-plugin/) |
| 📖 IntelliJ IDEA | [jetbrains.com/idea](https://www.jetbrains.com/idea/) |
| 📖 VS Code | [code.visualstudio.com](https://code.visualstudio.com/) |

---

<div align="center">
  <sub>Сделано с ❤️ для изучения автоматизации тестирования</sub>
</div>