package starter.matchers;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class VerifyChoucaTest extends PageObject {
    public void Verifytitle(){
        String title= getDriver().getTitle();
        System.out.println("el titulo es : "+ title);
        Assert.assertTrue(title.contains("Banco de Bogotá"));
    }
}
