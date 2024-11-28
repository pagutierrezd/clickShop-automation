package co.tiendasjumbo.pageObject;

import org.openqa.selenium.By;

public class ProductoPage {

    private static By btnAgregarCarrito = By.xpath("//p[text()='Agregar']");

    private static By txtCorreoAsociarCompra = By.xpath("//input[@type='email']");

    private static By btnEnviarCorreo = By.xpath("//div[text()='Enviar']");

    public static By getBtnMetodoEntrega() {
        return By.xpath("//*[@data-testid='base-modal']//*[@id='Recoge_en_tienda']");
    }

    public static By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public static By getTxtCorreoAsociarCompra() {
        return txtCorreoAsociarCompra;
    }

    public static By getBtnEnviarCorreo() {
        return btnEnviarCorreo;
    }

    private ProductoPage() {

    }
}
