package tasks;

import interactions.SelectList;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEmpty;
import static userinterfaces.FormThreePage.*;

public class DevicesPage implements Task {

    private List<Data> data;

    public DevicesPage(List<Data> data) {
        this.data = data;
    }

    public static DevicesPage form(List<Data> data) {
        return Tasks.instrumented(DevicesPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Data data : data) {
            actor.attemptsTo(
                    Click.on(SLTCOMPUTER),
                    WaitUntil.the(TXTCOMPUTER, isEmpty()).forNoMoreThan(10).seconds(),
                    Enter.theValue(data.getComputer()).into(TXTCOMPUTER),
                    Click.on(SLTVERSION),
                    WaitUntil.the(TXTVERSION, isEmpty()).forNoMoreThan(10).seconds(),
                    Enter.theValue(data.getVersion()).into(TXTVERSION),
                    Scroll.to(BTNNEXTLASTSTEP),
                    WaitUntil.the(BTNNEXTLASTSTEP, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(BTNNEXTLASTSTEP));
        }
    }
}
