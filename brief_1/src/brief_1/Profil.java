package brief_1;

public class Profil {

	int id;
	String code;
	String libelle;

	static int comp = 0;

	public Profil(String code, String libelle) {
		this.id = comp++;
		this.code = code;
		this.libelle = libelle;
	}

}
