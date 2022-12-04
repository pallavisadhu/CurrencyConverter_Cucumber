$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CurrencyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Currency Converter",
  "description": "",
  "id": "currency-converter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22667457552,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Euro to Candian money convertion",
  "description": "",
  "id": "currency-converter;verify-euro-to-candian-money-convertion",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the currency converter page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user convert the currency",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user should see the conversion rate",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user check the rate on the chart",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the rate should match with the conversion rate",
  "keyword": "Then "
});
formatter.match({
  "location": "CurrencyStepDef.the_user_is_on_the_currency_converter_page()"
});
formatter.result({
  "duration": 460068871,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDef.the_user_convert_the_currency()"
});
formatter.result({
  "duration": 9731985399,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDef.the_user_should_see_the_conversion_rate()"
});
formatter.result({
  "duration": 164557650,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDef.the_user_check_the_rate_on_the_chart()"
});
formatter.result({
  "duration": 6491896998,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDef.the_rate_should_match_with_the_conversion_rate()"
});
formatter.result({
  "duration": 54219,
  "status": "passed"
});
formatter.after({
  "duration": 1635727009,
  "status": "passed"
});
});