package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="/Users/pallavisadhu/eclipse-workspace/Currency_CucumberProj/src/test/java/features"
		,glue={"stepdef"}
		,plugin={"pretty","html:target/html","json:target/report.json"}
		,tags= {"@regression"}
		,monochrome=true,dryRun=false,strict=true
		)

public class TestRunner {

}
