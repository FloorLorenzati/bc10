package bc10.flnt.pom.test;

import bc10.fLorenzati.pom.base.TestBase;
import bc10.flnt.pom.page.ComputerDataBaseHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 extends TestBase {

    ComputerDataBaseHomePage cdb;

    @Test
    void addComputerEmpty(){
        cdb = new ComputerDataBaseHomePage(super.driver);
        cdb.irAlHome();
        cdb.clickNavigateAddComputer();
        cdb.clickCreateComputer();
        Assertions.assertEquals("Failed to refine type : Predicate isEmpty() did not fail.",cdb.obtenerMensajeError());
    }

}
