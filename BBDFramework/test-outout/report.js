$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "FreeCRM url is available",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title is login page is freeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter user name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter password7",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is navegate to account home page",
  "keyword": "And "
});
formatter.match({
  "location": "TestBDD.freeCRM_url_available()"
});
formatter.result({
  "duration": 14889085454,
  "status": "passed"
});
formatter.match({
  "location": "TestBDD.title_is_login_page_is_freeCRM()"
});
formatter.result({
  "duration": 48134364,
  "status": "passed"
});
formatter.match({
  "location": "TestBDD.user_enter_user_name()"
});
formatter.result({
  "duration": 249233606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 19
    }
  ],
  "location": "TestBDD.user_enter_password(int)"
});
formatter.result({
  "duration": 156710189,
  "status": "passed"
});
formatter.match({
  "location": "TestBDD.user_click_on_login_button()"
});
formatter.result({
  "duration": 40872339,
  "error_message": "java.lang.IllegalArgumentException: Argument is of an illegal type: org.openqa.selenium.chrome.ChromeDriver\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:84)\r\n\tat com.google.common.collect.Iterators$6.transform(Iterators.java:820)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:373)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:580)\r\n\tat DefinationBDD.TestBDD.user_click_on_login_button(TestBDD.java:48)\r\n\tat ✽.Then user click on login button(login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestBDD.user_is_navegate_to_account_home_page()"
});
formatter.result({
  "status": "skipped"
});
});