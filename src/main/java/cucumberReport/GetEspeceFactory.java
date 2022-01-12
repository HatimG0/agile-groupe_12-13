package cucumberReport;

public class GetEspeceFactory {
	public Espece getEspece(String especeType) {
		if(especeType == null) {
			return null;
		}
		if(especeType.equalsIgnoreCase("Joueur")) {
			return new Joueur();
		}
		else if(especeType.equalsIgnoreCase("Pokemon")) {
			return new Pokemon();
		}
		else if(especeType.equalsIgnoreCase("JoueurPokemon")) {
			return new JoueurPokemon();
		}
		
		return null;
	}

}
