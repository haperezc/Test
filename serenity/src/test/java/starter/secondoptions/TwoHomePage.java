package starter.secondoptions;
import net.thucydides.core.annotations.Step;
public class TwoHomePage {

    ActionsSecondHomePage TwoHome;

    @Step
    public  void openNavigator(){
        TwoHome.openUrl("https://www.choucairtesting.com/empleos-testing/");

    }
    @Step
    public void  option_Two(){
        TwoHome.be_jobs();
    }
    @Step
    public  void  sen_place(){
        TwoHome.be_gps();
    }
}
