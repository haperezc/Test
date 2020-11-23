package starter.matchers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class CreatingActionsofStep extends PageObject {


    public  void  entry_jobs()
    {
        WebElementFacade job = $(By.id("Btn-contactenos"));
        getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        job.shouldBeVisible();
        job.click();


    }
}
