package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormFourPage {
    public static final Target TXTPASS = Target.the("caja de texto pass").locatedBy("//form//div[1]/input[@type='password']");//name="password" id="password"

    public static final Target TXTPASS2 = Target.the("caja de texto pass2").locatedBy("//form//div[2]/input[@type='password']");//name="confirmPassword" id="confirmPassword"
     public static final Target CHECK1 = Target.the("check").locatedBy("//form/div[5]/label/span[1]");
     public static final Target CHECK2 = Target.the("check2").locatedBy("//form/div[6]/label/span[1]");
     public static final Target BTNCOMPLETE = Target.the("Boton complete").located(By.id("laddaBtn"));

}
