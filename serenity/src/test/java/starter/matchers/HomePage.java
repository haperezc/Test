package starter.matchers;

import net.thucydides.core.annotations.Step;

public class  HomePage {

    CreatingActionsofStep homepage;

    @Step
    public void openAplication(){
        homepage.open();
    }
    @Step
    public void entry_job()
    {
        homepage.entry_jobs();

    }
}
