package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import models.Data;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class Hook {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @DataTableType
    public Data data(Map<String, String> dataTable) {
        // Crea una instancia de data usando los datos de la tabla
        return new Data(dataTable.get("name"), dataTable.get("lastName"), dataTable.get("day"), dataTable.get("email"), dataTable.get("month"), dataTable.get("year"),
                dataTable.get("password"), dataTable.get("city"), dataTable.get("zip"), dataTable.get("country"), dataTable.get("computer"), dataTable.get("version"),
                dataTable.get("language"), dataTable.get("mobile"), dataTable.get("model"), dataTable.get("os")
        );
    }
}
