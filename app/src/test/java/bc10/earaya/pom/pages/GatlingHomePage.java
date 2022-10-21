package bc10.earaya.pom.pages;

import bc10.earaya.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHomePage extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    String urlHome = "https://computer-database.gatling.io/computers";
    By inputBlanck = By.xpath("//input[@id='searchbox']");
    By filterB = By.xpath("//input[@id='searchsubmit']");
    By botonAdd = By.xpath("//a[@id='add']");
    By home = By.xpath("//a[@class='fill']");
    By computerName = By.xpath("//a[normalize-space()='Computer name']");
    By introduced = By.xpath("//a[normalize-space()='Introduced']");
    By discontinued = By.xpath("//a[normalize-space()='Discontinued']");
    By company = By.xpath("//a[normalize-space()='Company']");




    //funciones o acciones que podemos desarrollar en la Pagina
    public void irAHomePage(){
        navegarAPagina(urlHome);
    }

    public void validarDespliegueBotones(){
        estaDesplegado(filterB);
        estaDesplegado(botonAdd);
    }

    public void validarDespliegueColumnas(){
        estaDesplegado(computerName);
        estaDesplegado(introduced);
        estaDesplegado(discontinued);
        estaDesplegado(company);
    }

    public void escribirEnBarraBusqueda(String texto){
        escribir(texto,inputBlanck);
    }



}
