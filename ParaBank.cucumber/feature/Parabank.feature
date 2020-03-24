@Registration&Login_Feature
Feature: ParaBank Website
  

  @tc_01
  Scenario: 
   Validate the Registration functionality
   
    Given the user launch the chrome application
    When the user open the Parabank Registration page 
    Then user gives the details 
    Then click on the Register button

  @tc_02
  Scenario: 
  Validate the login functionality
  
     Given the user launch the chrome browser
    When the user open the Parabankpage 
    Then enter username
    And enter password
    And click login button

   @tc_03
    Scenario:
    Validate the bill pay  functionality
    
     Given the user launch the chrome
     When the user open the Parabank Login Page
     Then the user login to the account
     And the user fills the details of the bill pay
     And submit the bill pay
     
   @tc_04
    Scenario:
    Validate the CustomerCare Message
    
     Given the user launchs the chrome browser
     When the user open the Parabank HomePage
     Then the user opens the msg and fill the details 
     And send the message to customer care
     
   @tc_05
   Scenario:
   Validate the submission details of AdminPage
   
    Given the user launch the chromebrowser
    When the user open the Parabank Homepage 
    Then the user select the Admin Page
    And the user submits the Administration Page