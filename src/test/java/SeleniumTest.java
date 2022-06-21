import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crypto.com/eea/");
        String title = driver.getTitle();
        System.out.println(title);
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        driver.navigate().to("https://www.coingecko.com/pl");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.close();
    }
}

