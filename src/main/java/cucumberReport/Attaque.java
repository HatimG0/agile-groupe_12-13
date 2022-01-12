package cucumberReport;

public class Attaque
{
    // variables d'instance
    private int dommage_base;
    private String type;
    
    /**
     * Constructeur d'objets de classe Attaque
     */
    public Attaque()
    {
        // initialisation des variables d'instance
        dommage_base = 1;
        type = "normal";
    }
    public Attaque(int dommage_base, String type)
    {
        // initialisation des variables d'instance
        this.dommage_base = dommage_base;
        this.type = type;
    }
    public int getDommageBase()
    {
        // retourne les dommages de base de l'attaque
        return this.dommage_base;
    }
    public void setDommageBase(int dommage_base)
    {
        this.dommage_base = dommage_base;
    }
    public String getType()
    {
        // retourne le type de l'attaque
        return this.type;
    }
    public void setType(String type)
    {
        this.type = type;
    }  
    public int dommageAttaque(Pokemon p)
    {
        int dommage = this.dommage_base;
        if (this.type == p.getType()){
            dommage *= 1.5;
        }
        dommage *= p.getNiveau();
        return dommage;
    }
    public void PertePv(Pokemon p) {
       int dommage = dommageAttaque(p);
       p.setPv(p.getPV() - dommage);
       try {
    	   if(p.getPV() > 0) {
    		   return;
    	   }
    	   else {
    		   p.setPv(0);
    		   p.setStatut("ko");
    	   }
    	 }
    	 catch(Exception e) {
    	   //  Block of code to handle errors
    	  System.out.println("");
    	 }      
    	
    }
}
