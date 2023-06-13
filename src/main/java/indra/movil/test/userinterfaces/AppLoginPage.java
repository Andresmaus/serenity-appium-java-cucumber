package indra.movil.test.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class AppLoginPage {
    public static Target TXT_USUARIO = Target.the("Caja de texto Usuario")
            .located(AppiumBy.accessibilityId("test-Usuario"));
    public static Target TXT_PASSWORD = Target.the("Caja de texto Contraseña")
            .located(AppiumBy.xpath("(//android.widget.EditText[@class='android.widget.EditText'])[2]"));
    public static Target BTN_LOGIN = Target.the("Bton iniciar sesion")
            .located(AppiumBy.accessibilityId("test-LOGIN"));

    public static Target LBL_PRODUCTOS = Target.the("Bton iniciar sesion")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTOS']"));

}
