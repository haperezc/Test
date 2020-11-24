package starter.thirdoption;

import net.thucydides.core.annotations.Step;

public class ThreeHomePage {

    ActionThreeHomePage thirdHome;

    @Step
    public void open_Browser(){
        thirdHome.openUrl("https://www.choucairtesting.com/job/analista-de-pruebas-bogota/");

    }

    @Step
    public  void click_apply(){
        thirdHome.click_apply_now();

    }
}
