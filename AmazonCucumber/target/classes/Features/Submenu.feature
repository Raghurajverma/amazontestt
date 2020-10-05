Feature: Selecting a category from Amazon mainmenu
 Verify all the options of sub-menu are accessed 

  Scenario: user is able to acess options of sub-menu 
    Given user is on homepage
    When user navigates to hamburger Menu
    And User selects a Sub menu option 
    Then success message will be displayed
    
 
