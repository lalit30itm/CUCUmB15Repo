Feature: facebook login
As a fb user, I want to enter username and pwd as a parameter

Scenario: validate fb login Scenario1
Given the user is on facebook login page
When he enters "user" as user name
And he enters "pwd" as Password
Then check username is present in textbox