package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	
    @Given("^User je na pocetnoj strani$")
    public void user_je_na_pocetnoj_strani()
    {
        System.out.println("User je na pocetnoj strani");
    }

    @When("^User se loguje na aplikaciju koristeci user \"([^\"]*)\" i password \"([^\"]*)\"$")
    public void user_se_loguje_na_aplikaciju_koristeci_user_something_i_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^User strana se prikazuje$")
    public void user_strana_se_prikazuje() 
    {
    	System.out.println("user_strana_se_prikazuje");
    }

    @And("^verifikujemo da se pojavila poruka Dobrodosli User$")
    public void verifikujemo_da_se_pojavila_poruka_dobrodosli_user() 
    {
    	System.out.println("verifikujemo da se pojavila poruka Dobrodosli User");
    }
    
    @Then("^verifikujemo da se pojavila poruka Neispravan password$")
    public void verifikujemo_da_se_pojavila_poruka_Neispravan_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("verifikujemo da se pojavila poruka Neispravan password");
    }
    
    @Then("^verifikujemo da se pojavila poruka Neispravan user$")
    public void verifikujemo_da_se_pojavila_poruka_Neispravan_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      System.out.println("verifikujemo da se pojavila poruka Neispravan user");
    }

}