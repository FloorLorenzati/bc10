package bc10.earaya.pom.test;

import bc10.earaya.pom.base.TestBase;
import bc10.earaya.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    GatlingHomePage gatlingHomePage;

    @Test
    public void test1(){
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.irAHomePage();
        gatlingHomePage.validarDespliegueBotones();
        gatlingHomePage.validarDespliegueColumnas();
    }
}
