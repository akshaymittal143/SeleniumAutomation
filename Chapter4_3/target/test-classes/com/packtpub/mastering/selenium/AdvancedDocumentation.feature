Feature: Verify the documentation for the advanced features in Selenium

  In order to show you a way to communicate with non technical stakeholder
  I want to introduce Cucumber in the video course "Mastering Selenium Testing Tools"

  Scenario: Selenium Page Object Design Pattern
    Given that seleniumhq.org is available
    When I read the documentation about page objects
    Then I should see the title "Test Design Considerations — Selenium Documentation" #Correct Title
    #Then I should see the title "Mastering Selenium Testing Tools" #Incorrect Title