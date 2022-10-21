package bc10.fLorenzati.pom.pages;

import bc10.fLorenzati.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends SeleniumBase {

    public GoogleHomePage(WebDriver driver){
        super(driver);
    }

    //Atributos - Localizadores

    String url="https://www.google.com/";
    By barraBusquedaLoc = By.name("q");
    By btnBuscarConGoogleLoc = By.name("btnK");
    By btnVoyATenerSuerteLoc = By.name("btnI");

    // Funciones - metodos de pagina

    public void irAlHome(){
        navegarAPagina(url);
    }

    public void buscarEnBarraConBotonBuscarConGoogle(String texto){
        escribir(texto,barraBusquedaLoc);
        escape(barraBusquedaLoc);
        click(btnBuscarConGoogleLoc);

    }
    public void buscarEnBarraConBotonVoyATenerSuerte(String texto) {
        escribir(texto, barraBusquedaLoc);
        escape(barraBusquedaLoc);
        click(btnVoyATenerSuerteLoc);
    }
}
