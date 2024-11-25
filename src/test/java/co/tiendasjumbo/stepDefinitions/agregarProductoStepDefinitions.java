package co.tiendasjumbo.stepDefinitions;

import co.tiendasjumbo.driver.SeleniumWebDriver;
import co.tiendasjumbo.steps.CategoriaSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class agregarProductoStepDefinitions {

    @Steps
    CategoriaSteps categoriaSteps = new CategoriaSteps();
    @Dado("el usuario esta en la pagina principal de Tiendas Jumbo")
    public void elUsuarioEstaEnLaPaginaPrincipalDeTiendasJumbo() {
        SeleniumWebDriver.chromeDrive("https://www.tiendasjumbo.co/");
    }

    @Cuando("selecciona una categoria y un producto")
    public void seleccionaUnaCategoriaYUnProducto() {

        categoriaSteps.seleccionCategoria();
        //productPage = homePage.selectProduct();
    }

    @Cuando("lo agrega al carrito de compras")
    public void loAgregaAlCarritoDeCompras() {
        //productPage.addToCart();
    }

    @Cuando("ingresa su correo electronico para asociar la compra")
    public void ingresaSuCorreoElectronicoParaAsociarLaCompra() {
        //cartPage.enterEmail();
    }

    @Cuando("selecciona el método de entrega y completa el formulario")
    public void seleccionaElMétodoDeEntregaYCompletaElFormulario() {
        //cartPage.selectDeliveryMethod();
        //cartPage.completeForm();
    }

    @Entonces("el proceso de agregar al carrito se completa correctamente")
    public void elProcesoDeAgregarAlCarritoSeCompletaCorrectamente() {
        //cartPage.verifyProductAdded();
    }
}
