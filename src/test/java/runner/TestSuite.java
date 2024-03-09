package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de las features
        glue = {"stepdefinitions"}, // Paquete donde están las Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Reportes de Cucumber
)
public class TestSuite {
}
