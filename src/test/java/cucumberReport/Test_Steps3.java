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


public class Test_Steps3 {
	Espece espece;
	String species;

	@Given("a (.*) species")
	public void a_Pokemon_species(String species) {
		espece=new GetEspeceFactory().getEspece(species);
		this.species=species;

	}
	
	@Then("someone with this species is created")
	public void someone_with_this_species_is_created() {
		assertEquals(espece.getEspece(),species);

	}


}
