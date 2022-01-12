package cucumberReport;
/**
 * DÃ©crivez votre classe AllStar ici.
 *
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 */
public class AllStar
{
    private Joueur j;
    public AllStar(Joueur j)
    {
        this.j=j;
    	
    }
    public String signatureStar(){
        String club = j.getClub();
        String nom= j.getNom();
        
        String s = "";
        if (club != null){
            s=s+"Le joueur "+nom+" appartenant au club "+club+" fait partie de l'équipe des AllStar !";
        }
        if (club == null){
            s = s+"Le joueur "+nom+" n'appartient à aucun club et n'est donc pas elligible à l'équipe des AllStar";
        } 
        return s;
    }

    
}
