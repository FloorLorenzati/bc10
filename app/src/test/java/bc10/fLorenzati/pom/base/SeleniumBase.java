package bc10.fLorenzati.pom.base;

import org.openqa.selenium.*;

import java.util.List;

public class SeleniumBase {
    //Atributo

    private WebDriver driver;

    //Constructor
    public SeleniumBase(WebDriver driver){
        this.driver = driver;

    }

    public void navegarAPagina(String url){
        driver.navigate().to(url);
    }
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> encontrarElemento (By locator){
        return driver.findElements(locator);
    }

    public String obtenerTexto (By locator){
        return driver.findElement(locator).getText();
    }

    public void escribir(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);

    }

    public void escape(By locator){
        driver.findElement(locator).sendKeys(Keys.ESCAPE);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean estaDesplegado(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean estaSelecionado(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void cambiarTamanhoDriver(int width,int height){
        driver.manage().window().setSize(new Dimension(width,height));

    }

    public int getWidth(){
        return driver.manage().window().getSize().width;
    }

    public int getHeight(){
        return driver.manage().window().getSize().height;
    }

    public WebDriver getDriver(){
        return getDriver();
    }
}
