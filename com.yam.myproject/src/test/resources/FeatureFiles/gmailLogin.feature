#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#https://www.youtube.com/watch?v=8fFtyN7bbpo To create framework

Feature: 	Login page automation of flipcart.com
Scenario:	 check login is successful  with valid credentials
Given user is on login page
When  user gives correct UN& Pwd
And 	click on login Button
Then 	user should navigate to login page

