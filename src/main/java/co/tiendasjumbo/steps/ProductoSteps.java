package co.tiendasjumbo.steps;

import co.tiendasjumbo.pageObject.*;
import co.tiendasjumbo.utils.DatosExcel;
import co.tiendasjumbo.utils.StepUtils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class ProductoSteps {

    private StepUtils stepUtils = new StepUtils();

    @Step
    public void comprarProducto() {

        stepUtils.esperarElementoVisible(ProductoPage.getBtnAgregarCarrito(), Duration.ofSeconds(15));
        stepUtils.clickJavaScript(ProductoPage.getBtnAgregarCarrito());

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "AgregarProducto");

            stepUtils.esperarElementoVisible(ProductoPage.getTxtCorreoAsociarCompra(), Duration.ofSeconds(15));
            stepUtils.escrituraTexto(ProductoPage.getTxtCorreoAsociarCompra(), dataExcel.get(0).get("CorreoAsociarCompra"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        stepUtils.seleccionClick(ProductoPage.getBtnEnviarCorreo());
    }
}
