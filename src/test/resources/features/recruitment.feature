# author: Fabian
# language: en


Feature: Recruitment Process

  I want to add a new candidate through the recruitment process
  So that I can validate the recruitment functionality.

  Background:
    Given "Fabian" opens the OrangeHRM website
    And enters their credentials

  @successful
  Scenario: Adding a new candidate and submitting the form
    When  navigates to the Recruitment section
    And   clicks on the Add button
    And   fills out the candidate form with all required information
    Then  agrees to the data retention policy and submits the form
 #   Then "Fabian" clicks on the Shortlist button
 #   And "Fabian" fills out the shortlist form with additional notes and saves it






