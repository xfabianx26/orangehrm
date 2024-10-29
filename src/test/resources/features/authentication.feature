# author: fabian
# language: en


@authenticationLogin
Feature: Successful Authentication on OrangeHRM
  I want to log in to OrangeHRM
  So that I can confirm that the login functionality works correctly

  Background:
    Given "Fabian" opens the OrangeHRM website

  Scenario: Successful user login in OrangeHRM
    When enters their credentials
    Then should see the homepage

