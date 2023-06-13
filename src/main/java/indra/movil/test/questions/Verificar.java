package indra.movil.test.questions;

import indra.movil.test.userinterfaces.AppLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar ingresoApp() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AppLoginPage.LBL_PRODUCTOS).answeredBy(actor);
    }
}
