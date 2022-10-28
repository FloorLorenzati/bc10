package bc10.fLorenzati.webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    WebDriver driver;
    By linkLoc = By.xpath("//a[@href ='/dynamic_loading/1']");

    By btnStartLoc = By.xpath("//div/button[text()='Start']");

    By HelloAsinLoc = By.xpath("//h4[text()='Hello World!']");


    @BeforeEach
    void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // Es una instruccion que espera que en cada elemento espera 3 segundos para cada referencia
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }
    @Test
    void waits(){
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");
        WebElement link1 = driver.findElement(linkLoc);
        link1.click();
        WebElement btnStart = driver.findElement(btnStartLoc);
        btnStart.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(HelloAsinLoc));
        Assertions.assertEquals("Hello World!",driver.findElement(HelloAsinLoc).getText());

    }
    @AfterEach
    void clean(){
        driver.close();
    }
}
