package bc10.flnt.pom.page;

import bc10.fLorenzati.pom.base.SeleniumBase;
import bc10.flnt.pom.base.SeleniumBase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerDataBaseHomePage extends SeleniumBase1 {

    public ComputerDataBaseHomePage(WebDriver driver) {
        super(driver);
    }

    String urlHome = "https://computer-database.gatling.io/computers";

    //Botones
    By btnAddLoc = By.id("add");
    By btnFilterNameLoc = By.id("searchsubmit");

    // Create computer

    By btnCreateComputerLoc = By.xpath("//input[@value='Create this computer']");
    By errorMsjLoc = By.xpath("//span[@class='help-inline']");
    By inputNameLoc = By.id("name");
    By msjDoneLoc = By.xpath("//div[@class='alert-message warning']");

    // Tabla
    By computerNameLoc = By.xpath("//th[@class='col-name header headerSortUp']");
    By introducedLoc = By.xpath("//th[@class='col-introduced header ']");
    By discontinuedLoc = By.xpath("//th[@class='col-discontinued header ']");
    By companyLoc = By.xpath("//th[@class='col-company header ']");


    public void irAlHome() {
        navegarAPagina(urlHome);
    }

    public void validarDespliegueBotones() {
        estaDesplegado(btnAddLoc);
        estaDesplegado(btnFilterNameLoc);
    }

    public void validarDespliegueColumnas() {
        estaDesplegado(computerNameLoc);
        estaDesplegado(introducedLoc);
        estaDesplegado(discontinuedLoc);
        estaDesplegado(companyLoc);
    }

    public void clickNavigateAddComputer() {
        clickear(btnAddLoc);
    }

    public void clickCreateComputer() {
        clickear(btnCreateComputerLoc);
    }

    public String obtenerMensajeError() {
        return obtenerTexto(errorMsjLoc);
    }

    public String obtenerMensajeDone() {
        return obtenerTexto(msjDoneLoc);
    }

    public void enviarTexto(String texto){
        escribir(texto,inputNameLoc);
    }

}
