package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\shreya\\Desktop\\MyNewProject\\BBDFramework\\src\\main\\java\\Features"
,glue= {"DefinationBDD"},
format= {"pretty", "html:test-outout"}
		
		)


public class TestRunner {

}