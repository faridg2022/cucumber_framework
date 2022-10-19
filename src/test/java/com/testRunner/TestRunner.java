package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		//features = {"Feature/ToGet_Details_Using_CountryName_UsingAPI.feature"} 
		//features = {"Feature/TestChercher_Tech_GET_Detail.feature"}
//		features = {"Feature/TestComplete_Order.feature"}
		//features = {"Feature/TestComplete_Login.feature"}
//		features = {"Feature/webOrder_Login.feature"}
//		features = {"Feature/spreecom_login.feature"}
//		features = {"Feature/spreecom_createAddress.feature"}
//		features = {"Feature/WebOrder_login_DataTable_multipleData.feature"}
//		features = {"Feature/WebOrder_login_DataTable_multipleData_AllTCs.feature"}
		features = {"Feature"}
		,glue= "com.StepDefinition"
		,dryRun=false
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/Report.html"}
//		,plugin  = {"pretty","html:CucumberReport/Report.html","rerun:Rerun/failed_scenarios.txt"}
//		,tags="not @sanity"
//		,tags= "@smoke,@sanity"
//		,tags= "@sanity or @smoke"
		
		)

public class TestRunner {

}
