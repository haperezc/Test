package starter.Empleo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.matchers.HomePage;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class TaskJobChoucar extends PageObject {
    @Managed
    WebDriver driver;

    @Steps
    HomePage home;

    @Test
    public void ChoucarTest (){
        driver.get("https://www.choucairtesting.com/");

        home.entry_jobs();
        home.verifyTitle();



    }





}
