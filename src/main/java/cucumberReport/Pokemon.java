package cucumberReport;

import java.util.ArrayList;
import java.util.List;

/**
 * DÃ©️crivez votre classe Pokemon ici.
 *
 * @author (votre nom)
 * @version (un numÃ©️ro de version ou une date)
 */
public class Pokemon extends Espece
{
    // variables d'instance
    private int niveau;
    private int pv;
    private String type;
    private String statut;
    //private List<Attaque> listeAttaques;
    private Attaque attaque;


    /**
     * Constructeur d'objets de classe Pokemon
     */
    public Pokemon()
    {
        // initialisation des variables d'instance
        this.niveau = 1;
        this.pv = 5;
        this.type = "normal";
        this.statut = "ok";
        //this.listeAttaques=new ArrayList<Attaque>();
        this.attaque=new Attaque();
    }
    
    public Pokemon(int niveau, int pv, String type)
    {
        // initialisation des variables d'instance
        this.niveau = niveau;
        this.pv = pv;
        this.type = type;
        this.statut = "ok";
        //this.listeAttaques=new ArrayList<Attaque>();
        this.attaque=new Attaque();
    }
    
    public int getNiveau()
    {
        // retourne le niveau du Pokemon
        return this.niveau;
    }
    public void setNiveau(int niveau)
    {
        this.niveau = niveau;
    }
    
    public int getPV()
    {
        // retourne le nombre de points de vie du Pokemon
        return this.pv;
    }
    public void setPv(int pv)
    {
        this.pv = pv;
    }

    public void changeNiveau()
    {
        this.niveau += 1;
    }
    
    public String getType()
    {
        // retourne le type du Pokemon
        return this.type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getStatut()
    {
        // retourne le type du Pokemon
        return this.statut;
    }
    public void setStatut(String statut)
    {
        this.statut = statut;
    }
    public Attaque getAttaque() {
    	return attaque;
    }
    public void setAttaque(Attaque att) {
    	this.attaque=att;
    }
    public String getEspece() {
    	return "Pokemon";
    }
    
}