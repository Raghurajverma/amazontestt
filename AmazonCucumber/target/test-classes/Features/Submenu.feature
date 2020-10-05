Feature: Selecting a category from Amazon mainmenu
 Verify all the options of sub-menu are accessed 
    
     Scenario Outline: user is able to acess options of sub-menu 
    Given user is on amazon homepage
    When user selects a hamburger Menu from the top left menu
    And User selects a Sub menu option 
    And user selects category <CategoryName> under Sub menu option   
    Then Welcome to prime video message will be displayed
 Examples:
 | CategoryName|             
| All Videos| 
| Movies    |  
| TV Shows  | 
| Kids Shows|   
 
