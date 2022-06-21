import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SeleniumEx {
    public static void main(String[] args) {
        // Ustawiamy sterownik Webdriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Otwieramy strone Ebay
        driver.get("https://www.ebay.com/");
        // Znadujemy search bara za pomoca Xpath i klikamy na niego
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchBar.click();
        // Wysukuje Iphone
        searchBar.sendKeys("Iphone");
        // Wyszukuje przycisk do wyszukiwania i klikam na niego
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        searchButton.click();
        // Klikam w pierwszy wynik
        WebElement firstResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a"));
        firstResult.click();
        // Potem przechodze do nowej zakładki i zamykam niepotrzebne okno
        driver.navigate().to("https://www.ebay.com/itm/255107476973?epid=22037999306&hash=item3b65972ded:g:J9YAAOSwHkhh1hIr&amdata=enc%3AAQAHAAAAsJVpDP3F5x9MO8NOupoVsPjfJdoFTu0jYspOoN6gwfY6wIRnJfhM%2F3tepP6Jh5U7lpqmpkKu%2FMq95UaInHEon2lDOAVN70BYgMJvfUmuUGDq3Kbp7IoLOCZyYwiv5o1FUTePMsT%2BJpPXQQsvHQ7l1LJfgz%2BwpXpKFl89cWWnHVh8Ryu%2BuaSqvQgdmk0PGsKIWatDMvHNaJ1XPUt8x1PMaklCFNSoKnKDmY72akQyY5hE%7Ctkp%3ABlBMUNaD6vmhYA");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        // Dodaje produkt do koszyka
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"atcRedesignId_btn\"]"));
        addToCart.click();
        // Klikam na drop down żeby wybrac kolor
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"msku-sel-1\"]"));
        dropdown.click();
        WebElement lightGray = driver.findElement(By.xpath("//*[@id=\"msku-opt-0\"]"));
        lightGray.click();

    }
}
