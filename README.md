# Автоматизированное тестирование с помощью Selenium


<img src="https://upload.wikimedia.org/wikipedia/commons/9/9f/Selenium_logo.svg" alt="seleniumLogo" width="200"/>

**Selenium** - это набор инструментов и библиотек для
автоматизации тестирования веб-приложений.
С помощью Selenium можно создавать и запускать автоматизированные тесты,
которые взаимодействуют с веб-браузером так, как это делает пользователь.

**Основные компоненты Selenium включают:**

- <a href="https://www.selenium.dev/documentation/ide/">Selenium IDE</a> -
  Интегрированная среда разработки для создания скриптов тестирования визуальным способом
  без необходимости программирования.

- <a href="https://www.selenium.dev/documentation/webdriver/">Selenium WebDriver</a> -
  Позволяет управлять браузером и выполнить различные действия на веб-страницах, такие как: Ввод текста,
  нажатие кнопок, переход по ссылкам и многое
  другое.

- <a href="https://www.selenium.dev/documentation/grid/">Selenium Grid</a> -
  Инструмент для распределенного тестирования, который позволяет запускать тесты параллельно на нескольких машинах и
  браузерах.



## Установка среды IntelliJ IDEA <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" width="20">



**IntelliJ IDEA** - это интегрированная среда разработки (IDE) для различных языков программирования, разработанная
компанией JetBrains. IntelliJ IDEA предоставляет разработчикам мощные инструменты для создания программного обеспечения,
улучшения производительности и удобства в процессе разработки.

1. Перейдите на [официальный сайт IntelliJ IDEA](https://www.jetbrains.com/idea/download/) и загрузите установщик IDE
   для
   Windows.

2. Запустите скачанный установочный файл.

3. Следуйте инструкциям мастера установки, выбрав необходимые параметры (путь установки, язык интерфейса и прочее).

4. После завершения установки запустите IntelliJ IDEA, введите или активируйте лицензионный ключ (если у вас есть),
   создайте или импортируйте проект и начните работу.

## Установка JDK (Java Development Kit) <img src="https://icon-icons.com/icons2/2108/PNG/512/java_icon_130901.png" width="20">



**JDK (Java Development Kit)** - это пакет разработки Java, который включает в себя все необходимые инструменты и
библиотеки
для разработки, компиляции, отладки и выполнения Java-приложений.

1. Перейдите на [официальный сайт Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) и
   загрузите установщик JDK для Windows.

2. Запустите скачанный установщик и следуйте инструкциям по установке, выбирая путь установки и другие опции на ваш
   выбор.

3. После завершения установки JDK, вы можете проверить версию JDK и наличие Java Development Kit на вашем компьютере,
   запустив команду `java -version` в командной строке.
4. Если JDK установлен успешно, она отобразит версию вашей установленной JDK.



## Установка и настройка библиотеки Selenium Java <img src="https://img.icons8.com/?size=256&id=VOnRj9vGpXV8&format=png" width="20">



#### С помощью Maven

1. Откройте файл `pom.xml` вашего проекта и добавьте зависимость Selenium Java в
   блок `<dependencies>`:

        <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.19.1</version> <!-- Укажите актуальную версию -->
           </dependency>

2. Сохраните файл `pom.xml`, чтобы Maven автоматически загрузил и добавил Selenium Java в проект.

#### С помощью Project Structure

1. Скачайте актуальную Selenium Java-библиотеку с [официального сайта Selenium](https://www.selenium.dev/downloads/) и
   распакуйте в
   удобную вам папку.
2. Откройте ваш проект в IntelliJ IDEA.
3. Нажмите на `File` в верхнем меню IntelliJ IDEA, затем выберите `Project Structure`.
4. Открыть вкладку`Modules` а затем выбрать перейти в раздел `Dependencies`.
5. Нажать на символ `+`, после чего выбрать опцию `JARs or directories`.
6. Выбрать директорию, куда сохранили загруженную библиотеки Selenium и нажать `OK`.

## Установка WebDriver (Chrome) <img src="https://www.svgrepo.com/show/303566/chrome-7-logo.svg" width="20">



1. Перейдите на [официальный сайт ChromeLabs](https://googlechromelabs.github.io/chrome-for-testing/)
2. Из появившегося списка, выберите и загрузите стабильную версию драйвера (версия браузера и веб-драйвера должны
   совпадать)
3. Распакуйте драйвер в удобное для вас место.



## Установка и простая настройка Selenium Server (Grid) <img src="https://air.imag.fr/images/7/73/Selenium_Grid_Logo.png" width="20">



1. Скачайте актуальную версию Selenium Server
   с [официального сайта Selenium](https://www.selenium.dev/downloads/).
2. Поместите файлы `selenium-server-4.19.1.jar` и `chromedriver.exe` в одну папку на вашем компьютере.
3. Создайте текстовый документ и откройте его для редактирования.
4. Вставьте следующие команды в текстовый документ:

**Для запуска Hub:**

`java -jar selenium-server-4.19.1.jar hub`

**Для запуска узла (Node) с использованием WebDriver:**

`java -jar selenium-server-4.19.1.jar node --selenium-manager true`

5. Сохраните текстовый документ с расширением `.bat` (например, `start_selenium.bat`).
6. Поместите этот файл в ту же папку, где находятся `selenium-server-4.19.1.jar` и `chromedriver.exe`.
7. Запустите файл `.bat`, чтобы запустить Selenium Server с Hub и Node.


## Простой тест



Для создания простого теста с использованием Selenium и Java в IntelliJ IDEA, выполните следующие шаги:

1. Внутри вашего проекта IntelliJ IDEA создайте новый Java-класс для вашего теста.

2. Импортируйте необходимые классы Selenium в начале вашего класса:

        java
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

3. В методе `main` вашего класса задайте путь к `ChromeDriver` и создайте новый экземпляр `WebDriver`:

        java
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();

4. Укажите ссылку на веб-сайт, используя объект driver:

        java
        driver.get("https://www.example.com");

5. Выполните действия на веб-странице с помощью команд Selenium, таких как поиск элементов, нажатие кнопок или ввод
   текста.

6. Закройте окно браузера по окончании вашего теста:

         java 
         driver.quit();

Следуя этим шагам, вы создали простой тестовый скрипт, используя Selenium и Java в IntelliJ IDEA. Вы можете запустить
этот тест, чтобы автоматизировать действия на веб-сайте и проверить функциональность вашего веб-приложения.
