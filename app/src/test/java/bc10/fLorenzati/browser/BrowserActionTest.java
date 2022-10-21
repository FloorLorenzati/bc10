package bc10.fLorenzati.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserActionTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.edgedriver().setup();
    }

    @Test
    void browserActionsTest(){
        String titulo;
        driver = new EdgeDriver();
        //abrir una url web 1
        driver.get("https://www.google.com");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es: "+ titulo);
        //abrir una url web 2
        driver.navigate().to("https://selenium.dev");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierta es: "+ titulo);

        //Back : volver a la pagina anterior
        driver.navigate().back();
        driver.get("https://www.google.com");
        titulo = driver.getTitle();

        //Forward
        driver.navigate().forward();
        driver.get("https://www.google.com");
        titulo = driver.getTitle();

        //Refresh
        driver.navigate().refresh();
        driver.get("https://www.google.com");
        titulo = driver.getTitle();

    }

    @AfterEach
    void close(){
        driver.quit();
    }
}
