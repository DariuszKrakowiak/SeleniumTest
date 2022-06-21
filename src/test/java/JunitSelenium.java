import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitSelenium {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
        assertEquals(title, "Amazon.com. Spend less. Smile more.");
    }
    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        String searchBarText = searchBar.getText();
        assertEquals(searchBarText,"");
    }
    @Test
    public void thirdTest(){
        assertThat(4)
                .isNotNegative()
                .isEqualTo(4)
                .isBetween(1,5);
        assertThat("Abc")
                .isNotEmpty()
                .doesNotEndWith("e");

    }
}
