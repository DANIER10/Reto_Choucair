package tasks;

import interactions.SelectList;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.FormOnePage.*;

public class FillOutPage implements Task {


    private List<Data> data;

    public FillOutPage(List<Data> data) {
        this.data = data;
    }

    public static FillOutPage form(List<Data> data) {
        return Tasks.instrumented(FillOutPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (Data data : data) {
            actor.attemptsTo(Click.on(HomePage.BTNJOINTODAY),
                    Enter.theValue(data.getName()).into(TXTFIRSTNAME),
                    Enter.theValue(data.getLastName()).into(TXTLASTNAME),
                    Enter.theValue(data.getEmail()).into(TXTEMAIL),
                    Scroll.to(BTNNEXTLOCATION),
                    Click.on(SLTMONTH),
                    SelectList.Desde(SLTMONTH, data.getMonth()),
                    Click.on(SLTDAY),
                    SelectList.Desde(SLTDAY, data.getDay()),
                    Click.on(SLTYEAR),
                    SelectList.Desde(SLTYEAR, data.getYear()),
                    WaitUntil.the(BTNNEXTLOCATION, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(BTNNEXTLOCATION)
            );
        }
    }
}
