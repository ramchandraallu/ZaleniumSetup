$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Employee.feature");
formatter.feature({
  "line": 1,
  "name": "Employee",
  "description": "Responsible for verfiying Benefits, Create Employee,\r\nDelete employee and check if the functionality works",
  "id": "employee",
  "keyword": "Feature"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature is responsible for testing all the scenarios for Login of application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4338809300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check Login with correct username and password",
  "description": "",
  "id": "loginfeature;check-login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I ensure application opened",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click login link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter UserName and Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "password"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see the username with hello",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnsureApplicationOpened()"
});
formatter.result({
  "duration": 13627164200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginLink()"
});
formatter.result({
  "duration": 1244769400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUserNameAndPassword(DataTable)"
});
formatter.result({
  "duration": 1721364300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 6545096500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUsernameWithHello()"
});
formatter.result({
  "duration": 1225220900,
  "status": "passed"
});
});