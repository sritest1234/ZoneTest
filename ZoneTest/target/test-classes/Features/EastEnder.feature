@test
Feature: Verify the Eastenders next Epsoide Time

  @tvicon
  Scenario: check the time of EastEnder next Epsoide via TV icon

    Given I am in HomePage
    When I select the "TV" icon in top bar
    And I should see the TV icon Page
    When I select TV Guide
    Then I should see TV Guide Page
    And  EastEnder time is shown under BBC one rows and check the time for the next episode

  @iplayer
  Scenario: check the time of EastEnder next Epsoide via iPlayer icon

    Given I am in HomePage
    When I select the "iPlayer" Page
    And I should see the iPlayer page
    When I select TV Guide on iPlayer page
    And I should see TV Guide Page
    And  EastEnder time is shown under BBC one rows and check the time for the next episode

  @search
  Scenario: Verify the next Epsoide of EastEnders displayed

    Given I am in HomePage
    When I enter "EastEnders" into search textbox
    And I select first EastEnders on the search suggestion list
    And I should see EastEnders search results page
    And I select EastEnders header link
    And I should see EastEnders HomePage
    Then The time for the next episode is displayed on the right
