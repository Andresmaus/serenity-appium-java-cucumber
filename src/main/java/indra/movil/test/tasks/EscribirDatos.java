package indra.movil.test.tasks;

import indra.movil.test.userinterfaces.AppLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribirDatos implements Task {

    private String user;
    private String pass;

    public EscribirDatos(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    public static EscribirDatos credenciales(String user, String pass) {
        return Tasks.instrumented(EscribirDatos.class, user, pass);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(AppLoginPage.TXT_USUARIO),
                Enter.theValue(pass).into(AppLoginPage.TXT_PASSWORD),
                Click.on(AppLoginPage.BTN_LOGIN)
        );
    }
}
