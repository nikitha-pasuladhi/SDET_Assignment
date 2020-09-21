Feature: Login Features
This feature includes scenario that would validate the following features.
1. Login as Admin
2. Login as Linda.anderson
3. Login with Negative data

Background: 
Given I am able to naviagte onto the login page


#Scenario: Login as Admin
#When I Enter the username as "Admin" 
#And I Enter the password as "admin123" 
#And I click on the login button
#Then i should see the username as "Welcome Test" 
#
#
#Scenario: Login as Linda.anderson
#
#When I Enter the username as "linda.anderson" 
#And I Enter the password as "linda.anderson" 
#And I click on the login button
#Then i should see the username as "Welcome Test" 
#Data Driven Test with one scenario scenario Outline

Scenario Outline: login with different user
When I Enter the username as "<user>"
And I Enter the password as "<pwd>"
And I click on the login button
Then i should see the username as "<name>"

Examples:
|user					 |pwd		        |name				 |
|Admin				 |admin123      |Welcome Linda|
|linda.anderson|linda.anderson|Welcome Linda|


Scenario: Login with Negative data
When I Enter the username as "sunil" 
And I Enter the password as "sunil" 
And I click on the login button
Then I should see a Error meassage as "Invalid credentials" 