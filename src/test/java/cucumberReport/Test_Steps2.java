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

public class Test_Steps2 {
	Pokemon pokemon;
	
	@Given("a pokemon Pikachu")
	public void a_pokemon_Pikachu() {
		pokemon=new Pokemon();
	}

	@Given("with {int} PV")
	public void with_PV(Integer int1) {
		pokemon.setPv(int1);
		assertEquals(pokemon.getPV(),int1);
	}

	@Given("with level {int}")
	public void with_level(Integer int1) {
		assertEquals(pokemon.getNiveau(),1);
	}

	@Then("with a miracle he pass to level {int}")
	public void with_a_miracle_he_pass_to_level(Integer int1) {
	    pokemon.setNiveau(int1);
	    assertEquals(pokemon.getNiveau(),int1);
	}

}