package brief_1;

public class test {

	public static void main(String[] args) {

		Profil profils[] = new Profil[5];

		profils[0] = new Profil("CP", "Chef de projet");
		profils[1] = new Profil("MN", "Manager");
		profils[2] = new Profil("DP", "Directeur de projet");
		profils[3] = new Profil("DRH", "Directeur des ressources humaines");
		profils[4] = new Profil("DG", "Directeur général");

//		

		Utilisateur utilisateurs[] = new Utilisateur[8];

		utilisateurs[0] = new Utilisateur("AA267678", "Srhayar", "Taha", "taha@gmail.com", "0655667766", 5000,
				"tsrhayar", "123456", "service", profils[0]);
		utilisateurs[1] = new Utilisateur("AA267678", "Azizi", "Hicham", "hicham@gmail.com", "0651267766", 5000,
				"hazizi", "123456", "service", profils[0]);
		utilisateurs[2] = new Utilisateur("AA345781", "Khaldi", "Hamza", "hamza@gmail.com", "0644223344", 5000,
				"hkhaldi", "123456", "service", profils[1]);
		utilisateurs[3] = new Utilisateur("AA345781", "Chouway", "Mostafa", "mostafa@gmail.com", "0644223344", 5000,
				"mchouway", "123456", "service", profils[1]);
		utilisateurs[4] = new Utilisateur("AA679303", "Alaoui", "Soufiane", "soufiane@gmail.com", "0611223344", 5000,
				"salaoui", "123456", "service", profils[2]);
		utilisateurs[5] = new Utilisateur("AA739109", "Amri", "Rada", "reda@gmail.com", "0699887766", 5000, "ramri",
				"123456", "service1", profils[3]);
		utilisateurs[6] = new Utilisateur("AA109283", "Hanini", "Othman", "Othman@gmail.com", "0645764233", 5000,
				"ohanini", "123456", "service", profils[4]);
		utilisateurs[7] = new Utilisateur("AA109283", "Moustahcine", "Mohammed", "Mohammed@gmail.com", "0645764233",
				5000, "mmoustahcine", "123456", "service", profils[4]);

		System.out.println("La liste des utilisateurs: ");
		for (Utilisateur u : utilisateurs) {
			u.afficher();
		}

		System.out.println("");

		System.out.println("La liste des managers: ");
		for (Utilisateur u : utilisateurs) {
			if (u.profil.code.equals("MN")) {
				u.afficher();
			}
		}
	}
}
