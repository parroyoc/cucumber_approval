Feature: Product Management

Background: Multi Page Web. Demonstrate a example recording and generating a document from Selenium WebDriver

  Scenario: Querying a product
    When a customer retrieves the list of products
    Then the list of products contains "cat"
    
  Scenario: Removing a product
    Given a product "carrot" is deleted
    When a customer retrieves the list of products
    Then the list of products does not contain "carrot"
        