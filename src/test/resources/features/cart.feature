Feature: Cart Functionality

Scenario: Add product to cart

Given User launches browser
When User searches product "iPhone"
And User adds product to cart
Then Product should be added successfully

