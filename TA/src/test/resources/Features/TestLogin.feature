Feature: Connexion

  Scenario: Valid Login information
    Given i am on TA login Page
    When I add my mail and password
    And click on OK
    Then The dashboard will be opened
    And the browser must be closed

  Scenario Outline: Invalid Login information
    Given i am on TA login Page
    When I insert my <mail> and <password>
    And click on OK
    Then The dashboard will be opened
    And the browser must be closed

    Examples: 
      | mail                                  | password      |
      | abcdfkkf                              | 22080023Ahm@d |
      | abcdej                                | jdjdjj        |
      | ahmed-baha-eddine.ben-dhaya@talan.com | dsjdjd        |
