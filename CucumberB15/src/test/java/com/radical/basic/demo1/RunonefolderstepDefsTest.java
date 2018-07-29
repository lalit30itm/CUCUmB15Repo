package com.radical.basic.demo1;
import org.junit.runner.manipulation.*;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/demo1/Cucumberpath.feature"},//for running two files give path in comma else it will run all the files present in folder
		glue = {"com/radical/basic/demo1/"}
		)
public class RunonefolderstepDefsTest {
	
}
