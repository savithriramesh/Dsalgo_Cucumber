package myTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
		monochrome=true,  //console output
		//tags = "@array or @array_pyn", //tags from feature file
		features = {"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Array_Dsalgo.feature", "C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Queue_Dsalgo.feature"}, //location of feature files
		glue= "stepDefinition") //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
		

}
//html:target/Dsalgo.html