package bc10.earaya.pom.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TestBase {

    //Atributos
    public WebDriver driver;

    @BeforeAll
    public static void initTesting(){
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    public void SetUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }

    @AfterEach
    public void close(){
        if(driver!= null){
            driver.close();
        }
    }

}
