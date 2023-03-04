Feature: Login Page feature

Scenario: Validate login page
Given user is on login page
Then username field is displayed
And password field is displayed
And login field is displayed
And Keep me login Checkbox Field is displayed
And Actitime logo is displayed



Scenario: Login Succesfully
Given user is on login page
Then user enters Username
And user enters Password
And User Clicks On loginButton
And DashBoard URL Should be displayed
And DashBoard Title Should be displayed



