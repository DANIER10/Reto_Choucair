package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormTwoPage {

    public static final Target BTNNEXTDEVICES = Target.the("Boton Next Devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
    public static final Target TXTCITY = Target.the("Texto ciudad").located(By.id("city"));
    public static final Target TXTZIP = Target.the("texto zip").located(By.id("zip"));
    public static final Target SLTCOUNTRY = Target.the("select country").located(By.xpath("//form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target TXTCOUNTRY2 = Target.the("bandeja select country").located(By.xpath("//form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target OPTCOUNTRY = Target.the("bandeja select country").located(By.xpath("//span/div/span"));


}
