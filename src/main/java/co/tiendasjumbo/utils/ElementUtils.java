package co.tiendasjumbo.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtils {

    /**
     * Elimina un elemento del DOM utilizando su XPath.
     *
     * @param driver  Instancia del WebDriver.
     * @param locator El XPath del elemento a eliminar.
     */
    public void eliminarElementoSobrepuesto(WebDriver driver, By locator) {
        try {
            // Verifica si el elemento sobrepuesto es visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            // Usa JavaScript para eliminar el elemento del DOM
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].remove();", elemento);

            System.out.println("El elemento superpuesto fue eliminado correctamente.");
        } catch (TimeoutException e) {
            System.out.println("El elemento superpuesto no está presente o no es visible.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el elemento superpuesto: " + e.getMessage());
        }
    }
}