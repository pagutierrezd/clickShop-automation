package co.tiendasjumbo.pageObject;

import org.openqa.selenium.By;

public class HomePage {

    private static By btnCategorias = By.xpath("//span[text()='Supermercado']");

    public static By getBtnCategorias() { return btnCategorias; }

    private HomePage() {

    }
}