package co.tiendasjumbo.pageObject;

import org.openqa.selenium.By;

public class CategoriaPage {

    public static By getBtnSubcategoria(String textSubcategoria) {
        return By.xpath("//img[@title='"+ textSubcategoria +"']");
    }

    private CategoriaPage() {

    }
}