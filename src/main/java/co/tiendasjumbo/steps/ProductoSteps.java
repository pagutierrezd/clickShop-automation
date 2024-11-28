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

    public void comprarProducto() {

        stepUtils.esperarElementoVisible(ProductoPage.getBtnAgregarCarrito(), Duration.ofSeconds(15));
        stepUtils.clickJavaScript(ProductoPage.getBtnAgregarCarrito());

    }

    public void asociarCorreoCompra() {

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "AgregarProducto");

            stepUtils.esperarElementoVisible(ProductoPage.getTxtCorreoAsociarCompra(), Duration.ofSeconds(15));
            stepUtils.escrituraTexto(ProductoPage.getTxtCorreoAsociarCompra(), dataExcel.get(0).get("CorreoAsociarCompra"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        stepUtils.clickJavaScript(ProductoPage.getBtnEnviarCorreo());

    }

    public void seleccionMetodoEntrega() {

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "AgregarProducto");

            stepUtils.clickJavaScript(ProductoPage.getBtnMetodoEntrega());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**  if (stepUtils.seleccionClick(ProductoPage.getBtnEntregaDomicilio().equals(" domicilio")) {
     // Seleccionar la opción "Entrega a domicilio"
     seleccionClick(By.id("id-entrega-domicilio")); // Cambia 'id-entrega-domicilio' por el localizador correcto

     // Completar el formulario de ubicación
     seleccionarOpcionDropdown(By.id("id-departamento"), departamento); // Cambia 'id-departamento' según el localizador real
     seleccionarOpcionDropdown(By.id("id-ciudad"), ciudad);
     escribirTexto(By.id("id-direccion"), direccion);
     escribirTexto(By.id("id-complemento"), complemento);

     } else if (metodoEntrega.equalsIgnoreCase("tienda")) {
     // Seleccionar la opción "Recoger en tienda"
     seleccionClick(By.id("id-recoger-tienda")); // Cambia 'id-recoger-tienda' por el localizador correcto

     // Aquí puedes incluir lógica adicional si es necesario para seleccionar la tienda
     System.out.println("Lógica para recoger en tienda aún no implementada."); // Placeholder
     } else {
     throw new IllegalArgumentException("Método de entrega no válido: " + metodoEntrega);
     }*/


}
