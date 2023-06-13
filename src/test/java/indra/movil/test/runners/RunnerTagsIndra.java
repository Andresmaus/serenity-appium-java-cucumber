package indra.movil.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = {"src/test/resources/features/saucelabs.feature"},
        tags = "@Login",
        glue = {"indra.movil.test.stepdefinitions", "indra.movil.test.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerTagsIndra {
}
