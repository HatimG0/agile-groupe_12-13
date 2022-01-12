package cucumberReport;

public class JoueurPokemon extends Joueur {
	private Pokemon pokemon;
	public JoueurPokemon(boolean contrat, String club, String nom) {
		super(contrat,club,nom);
		pokemon=new Pokemon();
	}
	public JoueurPokemon() {
		super();
		pokemon=new Pokemon();
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public String getEspece() {
		return "JoueurPokemon";
	}

}
