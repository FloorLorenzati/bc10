package bc10.flnt.pom.test;

import bc10.fLorenzati.pom.base.TestBase;
import bc10.flnt.pom.page.ComputerDataBaseHomePage;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    ComputerDataBaseHomePage cdb;

    @Test
    void validacionInterface(){
        cdb = new ComputerDataBaseHomePage(super.driver);
        cdb.irAlHome();
        cdb.cambiarTamanhoDriver(800,600);
        cdb.validarDespliegueBotones();
        cdb.validarDespliegueColumnas();
    }


}
