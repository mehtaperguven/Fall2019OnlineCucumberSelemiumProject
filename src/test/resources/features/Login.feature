Feature: Login
  As a user, I want to be able to login with username and password
  #Agile story
  #test Method=Test Case=Scenario
  #Test+ DataProvider=scenario Outline+Examples Table
    #we should not write two same phrases with different Gherkin keywords
    #Above three steps would have their own java codes
    # to implement in step_definitions class
 #Gherkin keywords:given, when, then,and, but,...
  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  Scenario: Login as store manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a store manager
    Then user should verify that title is a Dashboard