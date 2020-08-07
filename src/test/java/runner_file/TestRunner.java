package runner_file;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, 
				 features = "src/test/resources/features/",
				 glue = "step_definition")

public class TestRunner 
{

}


