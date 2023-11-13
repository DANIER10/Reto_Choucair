package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormOnePage {

    public static final Target TXTFIRSTNAME = Target.the("caja de texto primer nomrbe").located(By.id("firstName"));
    public static final Target TXTLASTNAME = Target.the("caja de texto segundo nomrbe").located(By.id("lastName"));
    public static final Target TXTEMAIL = Target.the("caja de texto email").located(By.id("email"));
    public static final Target SLTMONTH = Target.the("Selector mes").located(By.id("birthMonth"));
    public static final Target SLTDAY = Target.the("Selector día").located(By.id("birthDay"));
    public static final Target SLTYEAR = Target.the("Selector año").located(By.id("birthYear"));

    public static final Target BTNNEXTLOCATION = Target.the("Boton next location").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
