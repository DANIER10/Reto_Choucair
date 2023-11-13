package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormThreePage {
    public static final Target BTNNEXTLASTSTEP = Target.the("Boton Next Devices").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
    public static final Target SLTCOMPUTER = Target.the("Select computer").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target TXTCOMPUTER = Target.the("texto computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SLTVERSION = Target.the("Slt version").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target TXTVERSION = Target.the("texto computer").located(By.xpath(" //*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SLTLANGUAGE = Target.the("STL LANGUAGE").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target TXTLANGUAGE = Target.the("texto Language").located(By.xpath(" //*[@id='web-device']/div[2]/div[2]/div/input[1]"));


}
