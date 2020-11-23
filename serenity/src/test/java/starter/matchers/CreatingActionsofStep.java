package starter.matchers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class CreatingActionsofStep extends PageObject {

    public  void  verifyTitle()
    {
       String title= getDriver().getTitle();
        System.out.println("el titulo es : "+ title);
       Assert.assertTrue(title.contains("Choucair Testing"));


    }
    public  void  entry_jobs()
    {
        WebElementFacade job = $(By.id("menu-item-550"));
        getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        job.shouldBeVisible();
        job.click();


    }
}
