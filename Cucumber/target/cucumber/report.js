$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/LoginApp.feature");
formatter.feature({
  "line": 1,
  "name": "Login na aplikaciju",
  "description": "",
  "id": "login-na-aplikaciju",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Pocetna strana default Login",
  "description": "",
  "id": "login-na-aplikaciju;pocetna-strana-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User je na pocetnoj strani",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User se loguje na aplikaciju koristeci user \"Amel\" i password \"Amel\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User strana se prikazuje",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verifikujemo da se pojavila poruka Dobrodosli User",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_je_na_pocetnoj_strani()"
});
formatter.result({
  "duration": 224346300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amel",
      "offset": 45
    },
    {
      "val": "Amel",
      "offset": 63
    }
  ],
  "location": "stepDefinition.user_se_loguje_na_aplikaciju_koristeci_user_something_i_password_something(String,String)"
});
formatter.result({
  "duration": 6380200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_strana_se_prikazuje()"
});
formatter.result({
  "duration": 80100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifikujemo_da_se_pojavila_poruka_dobrodosli_user()"
});
formatter.result({
  "duration": 108100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Pocetna strana default Login",
  "description": "",
  "id": "login-na-aplikaciju;pocetna-strana-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User je na pocetnoj strani",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User se loguje na aplikaciju koristeci user \"Amel\" i password \"123456\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verifikujemo da se pojavila poruka Neispravan password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_je_na_pocetnoj_strani()"
});
formatter.result({
  "duration": 102500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amel",
      "offset": 45
    },
    {
      "val": "123456",
      "offset": 63
    }
  ],
  "location": "stepDefinition.user_se_loguje_na_aplikaciju_koristeci_user_something_i_password_something(String,String)"
});
formatter.result({
  "duration": 193500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifikujemo_da_se_pojavila_poruka_Neispravan_password()"
});
formatter.result({
  "duration": 237400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Pocetna strana default Login",
  "description": "",
  "id": "login-na-aplikaciju;pocetna-strana-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User je na pocetnoj strani",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User se loguje na aplikaciju koristeci user \"aaaaa\" i password \"Amel\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verifikujemo da se pojavila poruka Neispravan user",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_je_na_pocetnoj_strani()"
});
formatter.result({
  "duration": 208200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaaaa",
      "offset": 45
    },
    {
      "val": "Amel",
      "offset": 64
    }
  ],
  "location": "stepDefinition.user_se_loguje_na_aplikaciju_koristeci_user_something_i_password_something(String,String)"
});
formatter.result({
  "duration": 393200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifikujemo_da_se_pojavila_poruka_Neispravan_user()"
});
formatter.result({
  "duration": 180800,
  "status": "passed"
});
});