package co.tiendasjumbo.steps;

import co.tiendasjumbo.pageObject.*;
import co.tiendasjumbo.utils.DatosExcel;
import co.tiendasjumbo.utils.StepUtils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class CatalogoSteps {
    private StepUtils stepUtils = new StepUtils();

    @Step
    public void seleccionCategoria() {

        stepUtils.esperarElementoVisible(HomePage.getBtnCategorias(), Duration.ofSeconds(15));
        stepUtils.seleccionClick(HomePage.getBtnCategorias());
    }

    @Step
    public void seleccionSubcategoria() {

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "AgregarProducto");

            stepUtils.esperarElementoVisible(CategoriaPage.getBtnSubcategoria(dataExcel.get(0).get("Subcategoria")), Duration.ofSeconds(15));
            stepUtils.clickJavaScript(CategoriaPage.getBtnSubcategoria(dataExcel.get(0).get("Subcategoria")));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Step
    public void seleccionProducto() {

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "AgregarProducto");

            stepUtils.esperarElementoVisible(CategoriaPage.getBtnProducto(dataExcel.get(0).get("Producto")), Duration.ofSeconds(15));
            stepUtils.clickJavaScript(CategoriaPage.getBtnProducto(dataExcel.get(0).get("Producto")));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
