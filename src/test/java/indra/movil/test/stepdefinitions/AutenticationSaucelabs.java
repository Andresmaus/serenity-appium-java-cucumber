package indra.movil.test.stepdefinitions;

import indra.movil.test.questions.Verificar;
import indra.movil.test.tasks.AbrirApp;
import indra.movil.test.tasks.EscribirDatos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AutenticationSaucelabs {
    @Given("Indra ingresa a la apk saucelabs")
    public void indraIngresaALaApkSaucelabs() {
        OnStage.theActorCalled("Indra").wasAbleTo(AbrirApp.saucelabsApk());
    }
    @When("Digita las credenciales de acceso {string} y {string}")
    public void digitaLasCredencialesDeAccesoY(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(EscribirDatos.credenciales(user,pass));
    }
    @Then("verifica que ingreso correctamente")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        Verificar.ingresoApp(), Matchers.equalTo("PRODUCTOS")));
    }
}
