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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WebElementAvanzados {
    WebDriver driver;

    // @FindBy lo mismo que el By pero junto con el WebElement

    @FindBy(id="dropdown")
    WebElement dropdown;

    @FindBy(id="ui-id-3")
    WebElement btnEnable;

    @FindBy(id="ui-id-4")
    WebElement btnDownloads;

    @FindBy(id="ui-id-5")
    WebElement btnPDF;

    @FindBy(xpath = "//input[1]")
    WebElement checkBox1;


    @FindBy(xpath = "//input[2]")
    WebElement checkBox2;


    @BeforeEach
    void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // Es una instruccion que espera que en cada elemento espera 3 segundos para cada referencia
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);//Para crear una instancia de los elementos

    }

    @Test
    public void dropdown(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Clase para trabajar con los elementos <select>
        // Funcionalidades del Select
        Select manejoDropdawn = new Select (dropdown);
        manejoDropdawn.selectByValue("1");
        manejoDropdawn.selectByValue("2");
        manejoDropdawn.selectByValue("");


        //Selecionar por el comentario (Palabra escrita por vos mismo (text("Option 1")))
        manejoDropdawn.selectByVisibleText("Option 1");
        manejoDropdawn.selectByVisibleText("Option 2");


    }

    @Test
    public void dropDownDinamico(){
        driver.navigate().to("https://the-internet.herokuapp.com/jqueryui/menu");
        btnEnable.click();
        btnDownloads.click();
        Assertions.assertEquals("PDF",btnPDF.getText());
    }

    @Test
    public void checkbox(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        checkBox1.click();
        boolean estaClickeado1 = checkBox1.isSelected();

        checkBox2.click();
        boolean estaClickeado2 = checkBox2.isSelected();


    }

    @Test
    public void iframe(){
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        // Obetener todos los WebElements que contengan el tag iframe
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

        // Cambiarme al iframe
        driver.switchTo().frame(iframes.get(0));

        //Ya cambiados al iframe, obtendremos objetos de esta pagina
        WebElement areaEscritura = driver.findElement(By.id("tinymce"));
        areaEscritura.clear();
        areaEscritura.sendKeys("Hola saludos BC19 :D");
    }

    @Test
    public void webTables(){
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        // Lista de webtables en la pagina
        List<WebElement> webTables = driver.findElements(By.tagName("table"));

        // Hay dos tablas, entra a la primera
        WebElement tabla1 = webTables.get(0);

        //1. Cuantas filas y columnas tiene?
        List<WebElement> filas = tabla1.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        // La cantidad de filas
        System.out.println(filas.size());
        List<WebElement> columnas = tabla1.findElement(By.tagName("thead")).findElements(By.name("th"));
        // La cantidad de columnas
        System.out.println(columnas.size());


        // Obtener el webElement Due y prrsionarlo 2 veces para ordenar la tabla
        if(columnas.get(3).getText().contains("Due")){
            columnas.get(3).click();
            columnas.get(3).click();
        }

        // Obetener el nombre, apellido y valor de deuda de la primera fila
        String nombre = filas.get(0).findElement(By.xpath("//td[2]")).getText();
        String apellido = filas.get(0).findElement(By.xpath("//td[1]")).getText();
        String deuda = filas.get(0).findElement(By.xpath("//td[4]")).getText();

        System.out.println("El usuario con mayor deuda actual es: "+nombre+" con deuda"+deuda);



        System.out.println("marca debug");

    }

    @Test
    public void webTablas2() {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        //Creamos una tabala de todas la tablas en nuesta pagina web
        List<WebElement> webTablas = driver.findElements(By.tagName("table"));
        WebElement tabla2 = webTablas.get(1);
        //Cantidad de filas y columnas
        List<WebElement> columnas2 = tabla2.findElement(By.tagName("thead")).findElements(By.tagName("th"));
        List<WebElement> filas2 = tabla2.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        columnas2.get(1).click();
        for (int i = 0; i < filas2.size(); i++) {
            String nombre = filas2.get(i).findElement(By.xpath("//tr[" + (i + 1) + "]/td[@class = 'first-name']")).getText();
            String deuda = filas2.get(i).findElement(By.xpath("//tr[" + (i + 1) + "]/td[@class = 'dues']")).getText();
            System.out.println("Usuario:" + nombre + " con deuda" + deuda);
        }
    }

        @AfterEach
        void clean(){
            driver.close();
        }

    }
