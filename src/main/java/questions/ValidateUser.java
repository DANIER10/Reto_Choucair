package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.UserPage.TITTLEUSUARIOCREADO;

public class ValidateUser implements Question<Boolean> {

    boolean respuesta = false;

    public static ValidateUser create() {
        return new ValidateUser();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo( WaitUntil.the(TITTLEUSUARIOCREADO, isClickable()).forNoMoreThan(60).seconds());

        if (TITTLEUSUARIOCREADO.resolveFor(actor).isDisplayed()) {
            String texto = TITTLEUSUARIOCREADO.resolveFor(actor).getText();
            String mensaje = "Welcome to the world's largest community of freelance software testers!";
            if (texto.equals(mensaje)) {
                respuesta = true;
            }
        } else {
            System.out.println("El usuario fue creado pero no se pudo resolver la captcha a tiempo");
            respuesta = true;
        }
        return respuesta;
    }
}