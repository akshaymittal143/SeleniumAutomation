$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\packtpub\mastering\selenium\AdvancedDocumentation.feature');
formatter.feature({
  "line": 1,
  "name": "Verify the documentation for the advanced features in Selenium",
  "description": "\r\nIn order to show you a way to communicate with non technical stakeholder\r\nI want to introduce Cucumber in the video course \"Mastering Selenium Testing Tools\"",
  "id": "verify-the-documentation-for-the-advanced-features-in-selenium",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Selenium Page Object Design Pattern",
  "description": "",
  "id": "verify-the-documentation-for-the-advanced-features-in-selenium;selenium-page-object-design-pattern",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "that seleniumhq.org is available",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I read the documentation about page objects",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the title \"Test Design Considerations — Selenium Documentation\" #Correct Title",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumAdvancedDocumentationStepDefs.that_seleniumhq_org_is_available()"
});
formatter.result({
  "duration": 3132298074,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumAdvancedDocumentationStepDefs.I_read_the_documentation_about_page_objects()"
});
formatter.result({
  "duration": 3766615563,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});