<div style="display:flex; align-items:center; justify-content:center; text-align:center;">
    <div style="flex:1;">
        <img src="https://github.com/TaronJar/selenium-java-test/assets/144931263/416dc78a-36ef-4c55-a83e-079b2bac1700" alt="icon" width="200">
    </div>
    <div style="flex:2;">
        <h2><b>What is Selenium</b></h2>
        <p><b>Selenium</b> is a set of open source programs that are used for testing web applications and administering sites locally and online. Selenium programs allow you to automate browser actions. Among the project programs, Selenium Software is not just a tool, but a software package (a set of tools), each part of which meets different needs in testing. Here is a list of tools included in Selenium Software:</p>
        <ul style="list-style-type: disc;">
            <li><b><a href="https://www.selenium.dev/documentation/ide/">Selenium IDE</a></b> is a plugin for recording user actions in the browser.</li>
            <li><b><a href="https://www.selenium.dev/documentation/webdriver/">Selenium WebDriver</a></b> is a library for managing browsers.</li>
            <li><b><a href="https://www.selenium.dev/documentation/grid/">Selenium Grid</a></b> is a cluster of Selenium servers for managing browsers on different computers on the network.</li>
        </ul>
    </div>
</div>

<h2>Installing IntelliJ IDEA</h2>
<ul>
   <li>Download <a href="https://www.jetbrains.com/ru-ru/idea/">IntelliJ IDEA</a> from the official website</li>
   <li>Install IntelliJ IDEA with default settings</li>
</ul>

<h2>Installing JDK (Java Development Kit)</h2>
<p>The JDK is a full-featured development kit. It is a set of software for developing applications, including Java runtime environment, compilers and tools (such as JavaDoc and Java Debugger), which are necessary for creating and compiling programs. If you want to run Java programs in your browser or computer, having the Java Runtime Environment (JRE) installed is enough. But if you plan to develop Java programs using IntelliJ IDEA, you will also need the JDK.</p>
<ul>
   <li>Download JDK from the <a href="https://www.oracle.com/java/technologies/downloads/">official Oracle website</a></li>
   <li>Install JDK with default settings</li>
</ul>


<p>Once you have completed these steps, you can check if Java is installed correctly by opening a cmd console and running the following commands:</p>
<code>java -version</code><br>
<code>javac -version</code>

<p>If you see the Java version in the console, then Java is installed successfully.</p>

<h2>Loading the Selenium Java Client Driver</h2>
<p>You can download the Selenium Java Client Driver by going to the <a href="https://www.selenium.dev/downloads/">Selenium Java Client Driver Download Page</a>. On this page, you will find a list of client drivers for other languages, but you should select the driver for Java.</p>

<p>Once you download the driver, it will come as a file named. For simplicity, extract the contents of this file to a directory on your disk, such as  <code>C:\selenium-server\selenium-server-4.19.1.jar</code>.</p>

<h2>Browser Driver Installation (Windows)</h2>
<p>Let's describe an example of installing a browser driver. To install the Chrome driver, follow these steps:</p>
<ol>
   <li>Open the website: <a href="https://googlechromelabs.github.io/chrome-for-testing/">Chrome Driver Download Page</a></li>
   <li>Download the Chrome driver version that matches your Chrome browser version.</li>
   <li>To find out your Chrome browser version, open a new window in Chrome and type <code>chrome://version/</code> in the search bar.</li>
   <li>Unzip the downloaded file and place the unzipped folder containing the driver executable in a folder on your disk <code>C:\webdrivers\chromedriver.exe</code>.</li>
</ol>

<h2>Starting Selenium Server</h2>
<p>To launch the Selenium Server, follow these steps:</p>
<ol>
   <li>Open the command line by typing <code>cmd</code> in the search.</li>
   <li>Change directory to where the Selenium Server JAR file is located. For example, <code>cd C:\selenium-server</code>.</li>
   <li>Run the command to start the Selenium Hub: <code>java -jar selenium-server-4.19.1.jar hub</code>.</li>
</ol>

<p>Selenium Grid is a tool that distributes tests on multiple physical or virtual machines so scripts can be executed in parallel. It consists of a Hub (server acting as a central point) and Nodes (machines that perform tests). There is only one Hub in Selenium Grid and it starts running on one machine.</p>
<p>Nodes are instances attached to the Hub and perform tests. You can have multiple nodes with different configurations and browsers. Start the hub with the command mentioned above and make sure it is running successfully. You can access the Selenium Grid Hub's console at <a href="http://localhost:4444/grid/">http://localhost:4444/grid/</a>.</p>

<p>To start a Node, use the following command:</p>
<code>java -Dwebdriver.chrome.driver="C:\chromedriver\chromedriver.exe" -jar C:\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.99.1:4444/grid/register/</code>

<p>Check the state of the Selenium Hub and view the connected nodes with browsers available by visiting the Selenium Grid Hub console.</p>
<p>You can access the Selenium Grid Hub Console at: <a href="http://192.168.99.1:4444/">http://192.168.99.1:4444/</a></p>
<p>From the console, you can see the connected nodes and the browsers available for testing. The default configuration may include Chrome, Firefox, and IE browsers.</p>

<h2>Connecting Selenium to IntelliJ IDEA</h2>
<p>To connect Selenium to your IntelliJ IDEA project, follow these steps:</p>
<ol>
   <li>Open your IntelliJ IDEA project.</li>
   <li>Go to File -> Project Structure -> Modules.</li>
   <li>Click on the '+' icon and select 'JARs or directories'.</li>
   <li>Navigate to the location where you extracted the Selenium Java Client Driver (e.g., <code>C:\selenium\selenium-server-standalone-3.141.59.jar</code>) and select the JAR file.</li>
   <li>Click 'Apply' and then 'OK' to add Selenium to your project.</li>
</ol>

<p>Now you can start writing Selenium test scripts in your IntelliJ IDEA project and begin automating your browser testing.</p>

<h2>Simple Test</h2>
<p>To create a simple test using Selenium and Java in IntelliJ IDEA, follow these steps:</p>

<ol>
   <li>Inside your IntelliJ IDEA project, create a new Java class for your test.</li>
   <li>Import the necessary Selenium classes at the top of your class:</li>
   <pre><code>import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;</code></pre>
   <li>In the main method of your class, set the path to the ChromeDriver and create a new instance of the WebDriver:</li>
   <pre><code>System.setProperty("webdriver.chrome.driver", "C:\webdrivers\chromedriver.exe");
WebDriver driver = new ChromeDriver();</code></pre>
   <li>Navigate to a website in the browser using the driver:</li>
   <pre><code>driver.get("https://www.example.com");</code></pre>
   <li>Perform actions on the webpage using Selenium commands, such as finding elements, clicking buttons, or entering text.</li>
   <li>Close the browser window at the end of your test:</li>
   <pre><code>driver.quit();</code></pre>
</ol>

<p>By following these steps, you have created a simple test script using Selenium and Java in IntelliJ IDEA. You can run this test to automate actions on a website and verify the functionality of your web application.</p>
