package bc10.earaya.pom.test;

import bc10.earaya.pom.base.TestBase;
import bc10.earaya.pom.pages.GoogleHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGoogle extends TestBase {

    //Pages
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
