package Oriente_Objet;

public class Admin extends Personne {
	private String password;
	private String adresse;
	private String datenissance;
	private String question;
	private String reponse;
	
	public Admin(String nom, String prenom, String email, int tel, int cin, String sexe,String password,String adresse,String datenissance,String question,String reponse ) {
		super( nom, prenom, email, tel, cin, sexe);
		this.password=password;
		this.adresse=adresse;
		this.question=question;
		this.reponse=reponse;
		this.datenissance=datenissance;
		// TODO Auto-generated constructor stub
	}
	public String getQuestion() {
		return question;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getReponse() {
		return reponse;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDatenissance() {
		return datenissance;
	}

	public void setDatenissance(String datenissance) {
		this.datenissance = datenissance;
	}

}
