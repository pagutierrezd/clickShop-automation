package co.tiendasjumbo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@regresion",
        glue = "co.tiendasjumbo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class agregarProductoRunner {

}
