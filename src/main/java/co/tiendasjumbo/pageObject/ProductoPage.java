package co.tiendasjumbo.pageObject;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;

public class ProductoPage {

    private static By btnAgregarCarrito = By.xpath("//p[text()='Agregar']");

    private static By elementoSobrepuesto = By.xpath("//div[@class='vtex-modal-layout-0-x-backdropContainer vtex-modal-layout-0-x-backdropContainer--main-delivery vtex-modal-layout-0-x-backdropContainer']");

    private static By txtCorreoAsociarCompra = By.xpath("//input[@type='email']");

    private static By btnEnviarCorreo = By.xpath("//div[text()='Enviar']");

    private static By optDepartamento = By.xpath("//div[@class='css-1j9dihh-control']//div[text()='Departamento']");

    // public static By getBtnDepartamento(String textoDepartamento) {
    //    return By.xpath("//option[@value='" + textoDepartamento + "']");
    //}

    public static By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public static By getElementoSobrepuesto() {
        return elementoSobrepuesto;
    }

    public static By getTxtCorreoAsociarCompra() {
        return txtCorreoAsociarCompra;
    }

    public static By getBtnEnviarCorreo() {
        return btnEnviarCorreo;
    }

    public static By getOptDepartamento() {
        return optDepartamento;
    }

    private ProductoPage() {

    }
}
