package bc10.fLorenzati.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSizing {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.google.com.ar");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().setSize(new Dimension(800,600));
    }

    @Test
    void BrowserSize(){

        //Datos que podemos obtener desde un browser abierto
        // Largo y ancho de la ventana a browser
        int width = driver.manage().window().getSize().width; // Obtenemos el alto
        int height = driver.manage().window().getSize().height; // Obtenemos el ancho

        //Dimension
        Dimension dimension = driver.manage().window().getSize();
        int width2 = dimension.getWidth();
        int height2 = dimension.getHeight();

        //Cambiar el tamaño de la ventana en tiempo de ejecucion
        driver.manage().window().setSize(new Dimension(600,400));

    }

    @Test
    void browserPosition(){
        //Posiciones de la ventana 1
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();

        //Point (Posiciones de la ventana 2)
        Point posicion = driver.manage().window().getPosition();
        int x1 = posicion.x;
        int y1 = posicion.y;

        // Modificar la posicion de la ventana en tiempo de ejecucion
        driver.manage().window().setPosition(new Point(0,0));

    }


    @AfterEach
    void close(){
        driver.quit();
    }
}
