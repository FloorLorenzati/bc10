package bc10.earaya.pom.pages;

import bc10.earaya.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends SeleniumBase {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //Atributos - Localizadores
    String url = "https://www.google.com/";
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyATenerSuerteLocator = By.name("btnI");

    //Funciones - metodos de pagina
    public void irAlHome(){
        navegarAPagina(url);
    }

    public void buscarEnBarraConBotonBuscarConGoogle(String texto){
        escribir(texto,barraBusquedaLocator);
        clickear(btnBuscarConGoogleLocator);
    }

    public void buscarEnBarraConBotonVoyATenerSuerte(String texto){
        escribir(texto,barraBusquedaLocator);
        clickear(btnVoyATenerSuerteLocator);
    }

}
