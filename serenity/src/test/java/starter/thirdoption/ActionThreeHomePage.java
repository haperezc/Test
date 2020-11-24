package starter.thirdoption;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionThreeHomePage extends PageObject {
    public WebDriver driver;

    public  void  click_apply_now(){
       WebElementFacade apply = $(By.xpath("//*[@id=\"xpath-content\"]]"));
       Actions action = new Actions(getDriver());
       action.moveToElement(apply).click().build().perform();



        apply.click();



    }
}
