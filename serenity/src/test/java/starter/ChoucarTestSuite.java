package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@suite2"},
        plugin = {"pretty"},
        features = "src/test/resources/features"
)

public class ChoucarTestSuite { }
