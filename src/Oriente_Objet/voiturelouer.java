package Oriente_Objet;

public class voiturelouer {
private String immatricule;
private int cin_user;
private String datedebut;
private String datefin;
	public voiturelouer(String immatricule, int cin_user,String datedebut, String datefin) {
	
this.immatricule=immatricule;
this.setCin_user(cin_user);
this.setDatedebut(datedebut);
this.setDatefin(datefin);
}
	public String getImmatricule() {
		return immatricule;
	}
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	public int getCin_user() {
		return cin_user;
	}
	public void setCin_user(int cin_user) {
		this.cin_user = cin_user;
	}
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	
}
