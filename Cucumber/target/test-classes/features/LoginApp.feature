Feature: Login na aplikaciju

Scenario: Pocetna strana default Login
Given User je na pocetnoj strani
When User se loguje na aplikaciju koristeci user "Amel" i password "Amel"
Then User strana se prikazuje
And verifikujemo da se pojavila poruka Dobrodosli User

Scenario: Pocetna strana default Login
Given User je na pocetnoj strani
When User se loguje na aplikaciju koristeci user "Amel" i password "123456"
Then verifikujemo da se pojavila poruka Neispravan password

Scenario: Pocetna strana default Login
Given User je na pocetnoj strani
When User se loguje na aplikaciju koristeci user "aaaaa" i password "Amel"
Then verifikujemo da se pojavila poruka Neispravan user

