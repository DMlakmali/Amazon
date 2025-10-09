Feature: Login functionality
  As a valid user
  I want to login to the system
  So that I can access my account

  Scenario: Successful login with valid credentials
  Given user is on the Home page
  When user click on sign in option
  And  user enters valid "<email>"
  And user clicks on continue button
  And user enters password  "<password>"
  And clicks the login button
  And user skip keep hackers out page
  Then user should be navigated to the Home page

   
     Examples:
     | email| password | 
      |lakmalidissanayaka203@gmail.com|Ld203dissa#ak| 
    