package bc10.fLorenzati.pom.test;

import bc10.fLorenzati.pom.base.TestBase;
import bc10.fLorenzati.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    GatlingHomePage gatlingHomePage;

    @Test
    public void Test1(){
        gatlingHomePage = new GatlingHomePage(gatlingHomePage.getDriver());
        gatlingHomePage.irAlHomePage();
        gatlingHomePage.validarDespliegueBotones();
        gatlingHomePage.validarDespliegueColumnas();


    }
}
