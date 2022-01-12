package cucumberReport;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_Steps {
	JoueurPokemon joueur;

	@Given("a pokemon (.*)")
	public void a_pokemon_Joey(String joey) {
    	joueur=new JoueurPokemon(false,null,joey);
	}

	@Given("with an attack with (\\d+) and (.*)")
	public void with_an_attack_with_damage_and_type(int damage, String type) {
		Attaque a=new Attaque(damage,type);
		joueur.getPokemon().setAttaque(a);
		assertEquals(joueur.getPokemon().getAttaque().getDommageBase(),damage);
		assertEquals(joueur.getPokemon().getAttaque().getType(),type);
	}

	@When("he is drafted to (.*) after the selection match")
	public void he_is_drafted_to_Bulls_after_the_selection_match(String bulls) {
	    // Write code here that turns the phrase above into concrete actions
		String club=joueur.signerContrat(bulls);
		assertEquals(club,bulls);
	}

	@Then("he opens his NBA stats")
	public void he_opens_his_NBA_stats() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(joueur.getStats().getPointsPM(),0);
    	assertEquals(joueur.getStats().getAssistsPM(),0);
    	assertEquals(joueur.getStats().getRebounds(),0);
    }

	
}
