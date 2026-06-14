<div align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/9/9f/Selenium_logo.svg" alt="Selenium" height="100" style="margin: 0 20px;"/>
  <br/>
  <p>{{ОПИСАНИЕ_ПРОЕКТА}}</p>

  [![Java](https://img.shields.io/badge/Java-{{JAVA_VER}}-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
  [![Selenium](https://img.shields.io/badge/Selenium-{{SELENIUM_VER}}-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
  [![JUnit](https://img.shields.io/badge/JUnit-{{JUNIT_VER}}-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
  [![Maven](https://img.shields.io/badge/Maven-{{MAVEN_VER}}-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
  [![License](https://img.shields.io/badge/License-{{LICENSE}}-303030?style=for-the-badge&logo=opensourceinitiative&logoColor=white)](LICENSE)

  <hr/>
</div>

## О проекте

{{DESCRIPTION}}

### Возможности

- ✅ {{FEATURE_1}}
- ✅ {{FEATURE_2}}
- ✅ {{FEATURE_3}}

---

## Быстрый старт

### Предварительные требования

- ☕ **Java {{JAVA_VER}}** или выше — [скачать](https://adoptium.net/)
- 📦 **Maven {{MAVEN_VER}}+** — [скачать](https://maven.apache.org/download.cgi)
- 🌐 **Google Chrome** — [скачать](https://www.google.com/chrome/)

### Установка и запуск

```bash
# Клонирование
git clone {{REPO_URL}}
cd {{PROJECT_DIR}}

# Запуск всех тестов
mvn clean test
```

### Запуск конкретного теста

```bash
mvn test -Dtest={{TestClassName}}
```

---

## Структура проекта

```
{{PROJECT_DIR}}/
├── pom.xml
├── src/
│   └── test/java/{{BASE_PACKAGE_PATH}}/
│       ├── BaseTest.java              # Конфигурация WebDriver
│       ├── {{TestClass1}}.java         # {{Описание}}
│       ├── {{TestClass2}}.java         # {{Описание}}
│       └── ...
```

---

## Детальное описание тестов

### 🧱 BaseTest.java

Базовый класс для всех тестов. Выполняет настройку перед каждым тестом и гарантированно закрывает браузер после:

- Настройка ChromeOptions
- Автоматическая загрузка ChromeDriver через WebDriverManager
- Завершение WebDriver сессии в `@AfterEach`

### {{TestClass1}}.java

{{Описание тестового класса}}

---

## Зависимости (pom.xml)

| Артефакт | Версия | Назначение |
|---|---|---|
| `selenium-java` | {{SELENIUM_VER}} | Управление браузером |
| `junit-jupiter` | {{JUNIT_VER}} | Тестовый фреймворк |
| `webdrivermanager` | {{WDM_VER}} | Авто-управление драйверами |
| `maven-surefire-plugin` | {{SUREFIRE_VER}} | Запуск тестов |

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
          java-version: {{JAVA_VER}}
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
  <sub>{{FOOTER}}</sub>
</div>