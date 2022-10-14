package myTestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty", "json:target/Dsalgo.json"}, //reporting purpose
		monochrome=true,  //console output
		//tags = "@sanjan or TS001", //tags from feature file
		features = {"src/test/resources/Features"}, //location of feature files
		glue= "stepDefinition") //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
		
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();

}
}