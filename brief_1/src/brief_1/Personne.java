package brief_1;

public class Personne {

	String matricule;
	String nom, prenom, email, telephone;
	double salaire;

	public Personne(String matricule, String nom, String prenom, String email, String telephone, double salaire) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public double calculerSalaire() {
		return this.salaire;
	}

	public void afficher() {
		System.out.print(this.nom + " " + this.prenom + ", ");
	}
}
