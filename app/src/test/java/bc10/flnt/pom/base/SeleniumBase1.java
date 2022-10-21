package bc10.flnt.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SeleniumBase1 {

    //Atributo
    private WebDriver driver;

    //Constructor
    public SeleniumBase1(WebDriver driver){
        this.driver = driver;
    }

    //Funciones enmascarar o Wrapper de Selenium
    public void navegarAPagina(String url){
        driver.navigate().to(url);
    }
    public WebElement encontrarElemento(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> encontrarElementos (By locator){
        return driver.findElements(locator);
    }

    public String obtenerTexto (By locator){
        return driver.findElement(locator).getText();
    }

    public void escribir(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clickear(By locator){
        driver.findElement(locator).click();
    }

    public Boolean estaDesplegado(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean estaSeleccionado(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void cambiarTamanhoDriver(int width, int height){
        driver.manage().window().setSize(new Dimension(width,height));
    }

    public int obtenerWidth(){
        return driver.manage().window().getSize().width;
    }

    public int obtenerHeight(){
        return driver.manage().window().getSize().height;
    }

    public WebDriver getDriver(){
        return driver;
    }









}
