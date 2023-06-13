package indra.movil.test.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;

public class AbrirApp implements Task {
    public static AbrirApp saucelabsApk() {
        return Tasks.instrumented(AbrirApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("******************************************");
        Logger.getAnonymousLogger().info("****     Se abre la app Saucelabs     ****");
        Logger.getAnonymousLogger().info("******************************************");
        Logger.getAnonymousLogger().info("****     Iniciando Test Saucelabs     ****");
        Logger.getAnonymousLogger().info("******************************************");
        actor.attemptsTo();
    }
}
