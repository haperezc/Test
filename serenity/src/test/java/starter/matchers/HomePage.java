package starter.matchers;

import net.thucydides.core.annotations.Step;

public class HomePage {

    CreatingActionsofStep home;
    @Step("Verificar Titulo")
    public  void  verifyTitle()
    {
        home.verifyTitle();

    }
    @Step("Verificar que entra a la pagina")
    public void  entry_jobs()
    {
        home.entry_jobs();

    }
}
