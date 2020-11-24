package starter.secondoptions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsSecondHomePage extends PageObject {
    public WebDriver driver;

    public void be_jobs(){
        String job = "Analista de Pruebas Bogota";


        WebElementFacade name_job = $(By.id("search_keywords")).type("Empleo");
        String valjob = name_job.getValue();
        System.out.println("el  es : "+ valjob);

        Assert.assertEquals("Analista de Pruebas Bogota",valjob);

    }

    public void be_gps(){

        String place = "Bogota";
        WebElementFacade gps = $(By.id("search_location")).type(place);
        gps.sendKeys(Keys.ENTER);
        String obtener = gps.getValue();
        System.out.println("el  es : "+ obtener);

        Assert.assertEquals("Bogota",obtener);

    }
}
