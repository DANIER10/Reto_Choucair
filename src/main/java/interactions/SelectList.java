package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectList implements Interaction {

    private Target lista;
    private String opcion;

    public SelectList(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listaObjeto = lista.resolveFor(actor).findElements(By.tagName("option"));
        for (int i = 0; i < listaObjeto.size(); i++) {
            if (listaObjeto.get(i).getText().equals(opcion)) {
                listaObjeto.get(i).click();
                break;
            }
        }
    }

    public static SelectList Desde(Target lista, String opcion) {
        return new SelectList(lista, opcion);
    }
}