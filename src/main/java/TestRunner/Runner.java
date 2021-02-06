package TestRunner;



import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		//atures = "C:\\BDDWorkspace\\BDDFramework\\src\\main\\java\\Features\\login.feature", //the path of the feature files
		features = "C:\\BDDWorkspace\\BDDFramework\\src\\main\\java\\Features\\Spicejet.feature", //the path of the feature files
		glue={"Stepdefination"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		//strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"@Test"}	
		//tags={"SmokeTest1"}
		)

public class Runner {
	
	
	}
