package co.tiendasjumbo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.tiendasjumbo.driver.SeleniumWebDriver.driver;

public class StepUtils {

    public void seleccionClick(By elemento) {
        driver.findElement(elemento).click();
    }

    public void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }

    public void clickJavaScript(By elemento) {
        WebElement element = driver.findElement(elemento);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public void escrituraTexto(By elemento, String texto) {
        driver.findElement(elemento).sendKeys(texto);
    }
}
