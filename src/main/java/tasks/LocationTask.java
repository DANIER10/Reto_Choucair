package tasks;

import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.FormTwoPage.*;

public class LocationTask implements Task {

    private List<Data> data;

    public LocationTask(List<Data> data) {
        this.data = data;
    }

    public static LocationTask form(List<Data> data) {
        return Tasks.instrumented(LocationTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Data data : data) {
            actor.attemptsTo(
                    Click.on(TXTCITY),
                    Enter.theValue(data.getCity()).into(TXTCITY),
                    Hit.the(Keys.ARROW_DOWN).into(TXTCITY),
                    Hit.the(Keys.ENTER).into(TXTCITY),
                    Enter.theValue(data.getZip()).into(TXTZIP),
                    Scroll.to(BTNNEXTDEVICES),

                    // Al escoger madrid se escoge el País de forma automatica.
                    // Si escoges el paìs borras lo escogido en ciudad.
                    // Dejo el codigo para escoger el paìs

                    /* Click.on(SLTCOUNTRY),
                    WaitUntil.the(TXTCOUNTRY2, isVisible()).forNoMoreThan(10).seconds(),
                    Enter.theValue(data.getCountry()).into(TXTCOUNTRY2),
                    WaitUntil.the(OPTCOUNTRY, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(OPTCOUNTRY),*/

                    WaitUntil.the(BTNNEXTDEVICES, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(BTNNEXTDEVICES)
            );

        }
    }
}
