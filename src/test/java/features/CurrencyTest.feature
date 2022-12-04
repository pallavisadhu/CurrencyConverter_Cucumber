Feature: Currency Converter

@regression
Scenario: Verify Euro to Candian money convertion

Given the user is on the currency converter page
When the user convert the currency
Then the user should see the conversion rate
When the user check the rate on the chart
Then the rate should match with the conversion rate