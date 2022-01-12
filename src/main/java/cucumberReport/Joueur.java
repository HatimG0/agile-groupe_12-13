package cucumberReport;

 

import java.util.ArrayList;

/**
 * DÃ©crivez votre classe Joueur ici.
 *
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 */
public class Joueur extends Espece{
    private boolean contrat;
    private String club;
    private String nom;
    private Stats stats;
    private static ArrayList<AllStar> starListe=new ArrayList<AllStar>();
    public Joueur(boolean contrat,String club,String nom)
    {
        this.contrat = contrat;
        this.club = club;
        this.nom=nom;
    }
    public Joueur() {
    	this.contrat=false;
    	this.club="";
    	this.nom="";
    }
    public boolean getContrat(){
        return this.contrat;
    }
    public String getClub(){
        return this.club;
    }
    public String getNom() {
    	return this.nom;
    }
    public Stats getStats() {
    	return stats;
    }
    public void setNom(String nom) {
    	this.nom=nom;
    }
    public void setContrat(boolean contrat) {
    	this.contrat=contrat;
    }
    public void setClub(String club) {
    	this.club=club;
    }
    public String signerContrat(String club){
        if (club == "agent libre" || club == null){
            this.contrat = false;
            this.club = club;    
            return this.club;
        }
        else {
            this.contrat = true;
            this.club = club;
            this.stats=new Stats(0,0,0);
            return this.club;
        }
    }
    public void signerStar() {
    	starListe.add(new AllStar(this));
    }
    public String allStars() {
    	int i;
    	String s="";
    	for (i=0;i<starListe.size();i++){
        	s+=starListe.get(i).signatureStar();
    	}
    	return s;   		
    }
    public String getEspece() {
    	return "Joueur";
    }
    
}
