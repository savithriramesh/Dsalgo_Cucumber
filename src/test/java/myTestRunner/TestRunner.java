package myTestRunner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/Dsalgo.html", "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, // reporting purpose
		monochrome = true, // console output,
		 //tags = "@array or @array_pyn", //tags from feature file
		features = {"Features"},
		glue = "stepDefinition") // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests  {

}


/*
 C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Stack.feature",
				"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Queue_Dsalgo.feature",
				"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\DataStructure_Dsalso.feature",
				"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Z_Login_Dsalgo.feature",
				"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Array_Dsalgo.feature",
				"C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Features\\Graph.feature"} */

//extends AbstractTestNGCucumberTests