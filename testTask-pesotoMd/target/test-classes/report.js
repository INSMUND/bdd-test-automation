$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/NewUserRegistration.feature");
formatter.feature({
  "name": "New user registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User browses from Homepage to RegistrationForm page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the website Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageToRegistrationFormPageNavigationStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find a link to register and click the link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageToRegistrationFormPageNavigationStepDefinition.click_the_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Registration form is opening",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageToRegistrationFormPageNavigationStepDefinition.registration_form_is_opening()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User successfully submits Registration form steps with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the RegistrationForm Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User fills  name in romanian \u003cUserNameRom\u003e, surname in romanian as \u003cUserSurameRom\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "fills  name in english \u003cUserNameEng\u003e, surname in english as  \u003cUserSurameEng\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "fills  gender as \u003cGender\u003e,city as \u003cCity\u003e, address as \u003cAddress\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "fills  phone as \u003cPhone\u003e,email as  \u003cEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "fills  password as \u003cPassword\u003e, confirmed password as \u003cConfirmedPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "accepts terms, fills captcha",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks the link to submit",
  "keyword": "And "
});
formatter.step({
  "name": "the webpage with message Inregistrare in romanian version or Регистрация in russian appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserNameRom",
        "UserSurameRom",
        "UserNameEng",
        "UserSurameEng",
        "Gender",
        "City",
        "Address",
        "Phone",
        "Email",
        "Password",
        "ConfirmedPassword"
      ]
    },
    {
      "cells": [
        "Petru",
        "Silonosov",
        "Peter",
        "Shilonosov",
        "0",
        "Chisinau",
        "str.Calea Iesilor 10",
        "79668899",
        "mai.lfortests16082019@gmail.com",
        "testpesoto2019",
        "testpesoto2019"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User successfully submits Registration form steps with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the RegistrationForm Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_is_on_RegistrationForm_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills  name in romanian Petru, surname in romanian as Silonosov",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_fills_form_UserNameRom_UserSurameRom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills  name in english Peter, surname in english as  Shilonosov",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_fills_form_UserNameEng_UserSurameEng(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills  gender as 0,city as Chisinau, address as str.Calea Iesilor 10",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_fills_form_gender_city_address(int,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills  phone as 79668899,email as  mai.lfortests16082019@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_fills_form_phone_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills  password as testpesoto2019, confirmed password as testpesoto2019",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.user_fills_form_password_confirmedPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accepts terms, fills captcha",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.accepts_terms_fills_captcha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the link to submit",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.click_to_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the webpage with message Inregistrare in romanian version or Регистрация in russian appears",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationFormSubmitionStepDefinition.assert_webpage_has_correct_url_after_registerform_filled()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User activates account by using link from confirmation email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user finds confirmation email in list of inbox email noticed in Registration form \u003cIMAP_AUTH_EMAIL\u003e password \u003cIMAP_AUTH_PWD\u003e server \u003cIMAP_Server\u003e port \u003cIMAP_Port\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "user finds in email confirmation a link to activate account",
  "keyword": "When "
});
formatter.step({
  "name": "user get the link",
  "keyword": "And "
});
formatter.step({
  "name": "the webpage with message Pagina activata in romanian version or Страница активирована in russian appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "IMAP_AUTH_EMAIL",
        "IMAP_AUTH_PWD",
        "IMAP_Server",
        "IMAP_Port"
      ]
    },
    {
      "cells": [
        "mai.lfortests16082019@gmail.com",
        "mailForTests2019",
        "imap.gmail.com",
        "993"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User activates account by using link from confirmation email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user finds confirmation email in list of inbox email noticed in Registration form mai.lfortests16082019@gmail.com password mailForTests2019 server imap.gmail.com port 993",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivationAccountFromConfirmationEmailStepDefinition.get_list_inbox_email(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user finds in email confirmation a link to activate account",
  "keyword": "When "
});
formatter.match({
  "location": "ActivationAccountFromConfirmationEmailStepDefinition.find_link_activate_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get the link",
  "keyword": "And "
});
formatter.match({
  "location": "ActivationAccountFromConfirmationEmailStepDefinition.get_link_activate_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the webpage with message Pagina activata in romanian version or Страница активирована in russian appears",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivationAccountFromConfirmationEmailStepDefinition.account_is_activated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});