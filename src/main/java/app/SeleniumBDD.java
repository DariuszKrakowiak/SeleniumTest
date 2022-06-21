package app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBDD {
    @Given("A webpage")
    public void a_webpage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crypto.com/eea/");
        driver.close();
    }
    @When("I open a second webpage")
    public void i_open_a_second_webpage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.coingecko.com/pl/");
        driver.close();
    }
    @Then("I compare the title of a third webpage")
    public void i_compare_the_title_of_a_third_webpage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dariu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.close();
    }

}
