$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/multipleScenarioInSingleFile/MultiScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook2 login validation with parameter",
  "description": "As a fb user, I want to enter username and pwd as a parameter",
  "id": "facebook2-login-validation-with-parameter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7244059891,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "validate fb login Scenario1",
  "description": "",
  "id": "facebook2-login-validation-with-parameter;validate-fb-login-scenario1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user is on facebook login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he enters \"user\" as user name",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he enters \"pwd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "check username is present in textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "MultiScenarioStepDefs.the_user_is_on_facebook_login_Page()"
});
