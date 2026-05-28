Feature: Search Functionality

Scenario Outline: Search multiple products

Given User launches browser
When User searches product "<product>"
Then Product should display successfully

Examples:
| product |
| iPhone |
| MacBook |
| Samsung |