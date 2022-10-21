package bc10.fLorenzati.pom.pages;

import bc10.fLorenzati.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GatlingHomePage extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }

    //LOCALIZADORES
    String urlHome = "https://computer-database.gatling.io/computers";
    By inputBlanck = By.xpath("//input[@id='searchbox']");
    By filterB = By.xpath("//input[@id='searchsubmit']");
    By botonAdd = By.xpath("//a[@id='add']");
    By home = By.xpath("//a[@class='fill']");
    By computerName = By.xpath("//a[normalize-space()='Computer name']");
    By introduced = By.xpath("//a[normalize-space()='Introduced']");
    By discontinued = By.xpath("//a[normalize-space()='Discontinued']");
    By company = By.xpath("//a[normalize-space()='Company']");


    // Funciones o acciones que podemos desarrollar en la Pagina

    public void irAlHomePage(){
        navegarAPagina(urlHome);
    }

    public void redimensionar(int width,int height){
        cambiarTamanhoDriver(width,height);
    }

    public void validarDespliegueDeWebElement(){
        estaDesplegado(filterB);
    }

    public void validarDespliegueBotones(){
        estaDesplegado(filterB);
        estaDesplegado(botonAdd);
    }

    public void validarDespliegueColumnas() {
        estaDesplegado(computerName);
        estaDesplegado(introduced);
        estaDesplegado(discontinued);
        estaDesplegado(company);
    }

    public void escribirBarraBusqueda(String texto){
        escribir(texto,inputBlanck);
    }
}
