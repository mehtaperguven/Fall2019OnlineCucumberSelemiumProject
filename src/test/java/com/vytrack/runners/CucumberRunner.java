package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//comes from junit that is alternative to testNG
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = true
        //if we add strict=true it will not appear on the console error messages
        //>>>dryRun=true ...don't executes test yet//dryRun=false>>> executes test
)



public class CucumberRunner {
    //@RunWith => comes from Junit. It allows to have custom test configuration
//cucumber has it's own flow to run test - during runtime turns into executable test
//@CucumberOptions => stands for parameterization for test execution
//glue => trigger of cucumber test. Runner class needs to know where are step definition and feature file
//path to step definition, right click on step_definitions - copy from source root
//features => specifies path to the feature files right click on features - copy from content root
    //cucumber runner class needs to know
    // where are the step definitions and path of the step definitions
    //cucumber will convert the plain text to runable test
    ///glue--path to the package with step definitions
    //features--path to the directory/folder with feature files
}
