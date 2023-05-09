package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features",
		glue= {"stepdefintion"},
				plugin= {"pretty","html:target/Cucumber-pretty-report/PrettyReport.html",
						"json:target/cucumber.json",
						"junit:target/Junit-reports/JunitTestReport.xml",
						"rerun:target/return.txt3"},
				monochrome=true,
				dryRun=false,
				publish=true
		)


public class Test1Runner {
	
			
			
			
			
	

}
