package Oriente_Objet;

public class Personne {
int i=0;
    private int id;
    private String  nom;
    private String  prenom;
    private String email;
    private int  tel;
    private int cin;
    private String sexe;
    public Personne(String nom,String prenom,String email,int tel,int cin,String sexe) {
    	i++;
    	this.id=i;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.tel=tel;
        this.cin=cin;
        this.sexe=sexe;
      
    }      
    public int getid() {
        return id;
    }
 
    public String getNom() {
        return nom;
    }
    public void setnom(String fName) {
        this.nom=fName;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setprenom(String fName) {
        this.prenom=fName;
    }
    
    public String getEmail() {
        return this.email;
    }
    public void setemail(String fName) {
        this.email=fName;
    }
    
    public int getTel() {
        return this.tel;
    }
    public void settel(int t) {
        this.tel=t;
    }
    
    public int getCin() {
        return this.cin;
    }
    public void setcin(int fName) {
        this.cin=fName;
    }
    public String getSexe() {
        return this.sexe;
    }
    public void setsexe(String fName) {
        this.sexe=fName;
    }     
   
 
    

}
