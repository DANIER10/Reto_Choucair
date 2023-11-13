package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import util.Constants;

public class OpenPageTask implements Task {


    public static OpenPageTask utest() {
        return Tasks.instrumented(OpenPageTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constants.URL));
    }
}
