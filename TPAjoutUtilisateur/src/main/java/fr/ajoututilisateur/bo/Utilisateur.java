package fr.ajoututilisateur.bo;

public class Utilisateur {
	
	private String nom;
	private String prenom;
	private String email;
	private int identifiant;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	
	public Utilisateur() {
		
	}
	
	public Utilisateur(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	public Utilisateur(String nom, String prenom, String email, int identifiant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.identifiant = identifiant;
	}

}
