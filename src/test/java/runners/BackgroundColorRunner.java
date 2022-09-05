package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//src\\test\\java\\features\\White.feature
		features="classpath:features",
		glue="steps",
		tags="@Skyblue",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/cucumberreport",
				"json:target/cucumberreport.json"
			
				
		}
	
		)
public class BackgroundColorRunner {

}
