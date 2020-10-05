@tag
Feature: Register Features
  I want to use this template for my feature file

Background: 
Given I am able to naviagte to Homepage

  Scenario Outline: Register User
    When I click on Sign up
    Then Registration Screen Opens
    Then I Select what do you want to do
    And I Enter First Name "<FirstName>"
    And I Enter Last Name "<LastName>"
    And I Enter e-mail "<e-mail>"
    And I Enter Username "<Username>"
    And I Enter Pass "<Pass>"
    And I Enter Confirm Password "<ConfirmPassword>"
    And I Click Register
   Then I should see "<Name>"
 #   Then I see Your personal settings have been registered
    Then I click on profile
		And I Validate e-mail "<e-mail>"
		Then I navigate to homepage
		Then I click on compose
		Then I should see compose message
		Then I enter toemail "<toemail>"
		Then I enter subject "<subject>"
		Then I enter content "<content>"
		Then I click on send
		Then I should see The message has been sent "<message> <tofirstname> <tolastname> <tousername>"
		
Examples:

|FirstName | LastName | e-mail                | Username | Pass       | ConfirmPassword|Name                   |toemail           |subject |content                   | message|tofirstname| tolastname | tousername|
|Harika    | Raj      | hariraj@xyz.com       |	hariraj  |Welcome123  |Welcome123      |Dear Harika Raj,\n\nYour personal settings have been registered.       |pk123@gmail.com   |Testmail|Hi, /n This is for Testing|The message has been sent to|Pavan|Kumar|(pavankumar)|
#|Deepika   | T        | deepat@xyz.com        | deepat   | Password12 | Password12     |Dear Charani Alla,     |pk123@gmail.com   |Testmail|Hi, /n This is for Testing|
#|Nikitha   | Pasuladhi| nikitha2705@gmail.com | nipasula | Welcome123 | Welcome123     |Dear Nikitha Pasuladhi,|pk123@gmail.com   |Testmail|Hi, /n This is for Testing|


    
    
