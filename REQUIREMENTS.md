Practical Exercise 1
 
You may choose any of the following languages for this exercise: java, ruby or C#
 
1. Create a project to test an e-commerce website using Selenium WebDriver. Sufficient instructions should be included so that anybody is able to clone and run the test.
2. Using solely Webdriver, create a test that:
 * adds an item to a cart
 * views the contents of the cart
 * validates that the chosen item is added to the cart
3. Taking the following feature file, implement the scenario using both Cucumber and Webdriver
 
Feature: Add to cart 
  As a customer
  I want to view the contents of my bag prior to checkout
 
    Scenario: Add item to bag and view cart
        Given I have added an item to my cart
        When I view the contents of my cart
        Then I should see the contents of the cart include the item
 
For both points 2 and 3, you must consider execution across different OS/browser combinations.
 
You must also consider execution across different environments where the available products may not be consistent.
Code that could be improved upon should be commented with details of any improvements that could be made.