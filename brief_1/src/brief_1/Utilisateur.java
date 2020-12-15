package brief_1;

public class Utilisateur extends Personne {

	String login;
	String motDePasse;
	String service;
	Profil profil;

	public Utilisateur(String matricule, String nom, String prenom, String email, String telephone, double salaire,
			String login, String motDePasse, String service, Profil profil) {
		super(matricule, nom, prenom, email, telephone, salaire);
		this.login = login;
		this.motDePasse = motDePasse;
		this.service = service;
		this.profil = profil;
	}

	public double calculerSalaire() {
		if (this.profil.code.equals("MN")) {
			return salaire * 1.08;
		} else if (this.profil.code.equals("DG")) {
			return salaire * 1.15;
		}
		return super.calculerSalaire();
	}

	public void afficher() {
		super.afficher();
		System.out.println("Le " + this.profil.libelle + " le salaire est: " + this.calculerSalaire());
	}

}
