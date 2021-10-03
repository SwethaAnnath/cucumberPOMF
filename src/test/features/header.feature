Feature: Basket Feature

  As a user i should be able to add an item to the Basket

  @Basket1
  Scenario: Add an item to the basket

    Given I'm on Homepage "http://www.next.co.uk"
    When I search for an item "Skirts"
    When I click on search Button"
    When I should get relavant Item results "Skirts"
    When I select the Item  I should be able to redirected to the  Itemdetails page "Roman Pleated Maxi Skirt"
    Then I should be able to add Item to the bag using Add to Bag Button"
