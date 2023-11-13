package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target BTNJOINTODAY = Target.the("Boton JOIN TODAY").located(By.className("unauthenticated-nav-bar__sign-up"));

}
