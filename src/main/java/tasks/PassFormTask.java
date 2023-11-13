package tasks;

import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.FormFourPage.*;

public class PassFormTask implements Task {

    private List<Data> data;

    public PassFormTask(List<Data> data) {
        this.data = data;
    }

    public static PassFormTask final2(List<Data> data) {
        return Tasks.instrumented(PassFormTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Data data : data) {
            actor.attemptsTo(
                    JavaScriptClick.on(TXTPASS),
                    Enter.theValue(data.getPassword()).into(TXTPASS),
                    JavaScriptClick.on(TXTPASS2),
                    Enter.theValue(data.getPassword()).into(TXTPASS2),
                    Click.on(CHECK1),
                    Click.on(CHECK2),
                    WaitUntil.the(BTNCOMPLETE, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(BTNCOMPLETE)
            );
        }
    }
}
