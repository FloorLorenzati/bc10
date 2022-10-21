package bc10.fLorenzati.pom.test;

import bc10.fLorenzati.pom.base.TestBase;
import bc10.fLorenzati.pom.pages.GoogleHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGoogle extends TestBase {

    GoogleHomePage ghp;

    @Test
    void busquedaNormal(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAlHome();
        ghp.buscarEnBarraConBotonBuscarConGoogle("Tsoft");
        Assertions.assertTrue(true);
    }
    @Test
    void busquedaSuerte(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAlHome();
        ghp.buscarEnBarraConBotonVoyATenerSuerte("Tsoft");
        Assertions.assertTrue(true);
    }
}
