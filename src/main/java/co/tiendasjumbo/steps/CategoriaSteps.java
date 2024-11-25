package co.tiendasjumbo.steps;

import co.tiendasjumbo.pageObject.*;
import co.tiendasjumbo.utils.StepUtils;

public class CategoriaSteps {
    private StepUtils stepUtils = new StepUtils();

    public void seleccionCategoria() {
        stepUtils.seleccionClick(HomePage.getBtnCategorias());
    }
}
