
package Oriente_Objet;

public class Car{
	int i=0;
	private int id;
    private String  marque;
    private String  modele;
    private String année;
    private String  energie;
    private String boite;
    private String puissance;
    private String immatricule;
   
    private String etat;
    public Car(String marque,String modele,String année,String immatricule,String energie,String boite,String puissance) {
    	this.setId(i);
        this.marque=marque;
        this.modele=modele;
        this.année=année;
        this.energie=energie;
        this.boite=boite;
        this.puissance=puissance;
        this.immatricule=immatricule;

        this.etat="Libre";
    }          public String getMarque() {
        return marque;
    }
    public void setmarque(String fName) {
        this.marque=fName;
    }
    public String getModele() {
        return this.modele;
    }
    public void setmodele(String fName) {
        this.modele=fName;
    }
    
    public String getAnnée() {
        return this.année;
    }
    public void setyear(String fName) {
        this.année=fName;
    }
    
    public String getEnergie() {
        return this.energie;
    }
    public void setenerg(String fName) {
        this.energie=fName;
    }
    
    public String getBoite() {
        return this.boite;
    }
    public void setboi(String fName) {
        this.boite=fName;
    }
    public String getPuissance() {
        return this.puissance;
    }
    public void setpuiss(String fName) {
        this.puissance=fName;
    }     

	public String isEtat() {
	return this.etat;
		
	}
	public void setEtat(String a) {
		this.etat =a;
	}
	public String getImmatricule() {
		return immatricule;
	}
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}     
 
 
    }