package tp;

import java.util.Scanner;

public class MonProg {

	public static void main(String[] args) {

		String nom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);

		do {Boolean bool1 = true;
			String p1 = args[0];
			String p2 = args[1];
			String p3 = args[2];
			String p4 = "TestVar4";
			String p5 = "TestVar5";
			String p6 = "TestVar6";
			Integer i1 = 10;
			Integer i2 = 20;
			Integer i3 = 21;
			Double i4 = 2.99792458E8; // Vitesse Lumiere
			Double i5 = 1.50000000E11; // Distance Terre-Soleil
			
			// INTRO ET ENTREE NOM USER
			System.out.println("Nom du Testeur : ");
			nom = sc.nextLine();
			System.out.println("");
			System.out.println("Bonjour " + nom + ", Les tests JAVA vont d�buter dans 10 secondes...");

			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("");
			System.out.println("Maintenant " + nom + ", l'affichage des arguments et variables va d�buter...");
			System.out.println("");

			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// UTILISATION DES ARGS
			System.out.println("Voici les arguments entr�s dans la Running Configuration du programme : " + p1 + " - "
					+ p2 + " - " + p3);

			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// UTILISATION VARIABLES STRING
			System.out.println("Voici les valeurs des variables String : " + p4 + " - " + p5 + " - " + p6);

			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// UTILISATION VARIABLES INTEGER
			System.out.println("Voici les valeurs des variables Integer : " + i1 + " - " + i2 + " - " + i3);

			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// UTILISATION VARIABLES DOUBLE
			System.out.println("Voici les valeurs des variables Double : " + i4 + " - " + i5);

			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// CALCULS
			System.out.println("");
			System.out.println("Maintenant " + nom + ", les tests de calculs de variables vont d�buter...");
			System.out.println("");

			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Addition de i1 et i2 = " + (i1 + i2));

			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Soustraction de i1 et i2 = " + (i1 - i2));
			
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Division de i2 et i1 = " + (i2 / i1));
			
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Multiplication de i1 et i2 = " + (i1 * i2));
			
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
			}

			System.out.println("Modulo de i3 et i1 = " + (i3 % i1));
			
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Temps de trajet entre la terre et le soleil � la vitesse de la lumi�re = " + (i5 / i4)
					+ " secondes");
			
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
			}
			// UTILISATION CONDITIONS
			System.out.println("");
			System.out.println("Maintenant " + nom + ", les tests de conditions IF/ELSE vont d�buter...");
			System.out.println("");
			
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (bool1 == true) {
				System.out.println("La valeur booleene de bool1 est true (ENTREE IF)");
			}

			else if (bool1 == false) {
				System.out.println("La valeur booleene de bool1 est false (ENTREE ELSE IF)");
			}

			else {
				System.out.println("La valeur boolenne de bool1 n'est pas d�finie (ENTREE ELSE)");
			}

			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			bool1 = false;

			if (bool1 == true) {
				System.out.println("La valeur booleene de bool1 est true (ENTREE IF)");
			}

			else if (bool1 == false) {
				System.out.println("La valeur booleene de bool1 est false (ENTREE ELSE IF)");
			}

			else {
				System.out.println("La valeur boolenne de bool1 n'est pas d�finie (ENTREE ELSE )");
			}

			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// UTILISATION BOUCLE FOR
			System.out.println("");
			System.out.println("Maintenant " + nom + ", le tests de boucle FOR va d�buter...");
			System.out.println("");
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (int ifor = 10; ifor > 0; ifor--) {
				System.out.println(ifor);
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// FIN PROGRAMME
			System.out.println("");
			System.out.println("FIN DU PROGRAMME");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// REMERCIEMENTS
			System.out.println("");
			System.out.println("Merci " + nom
					+ " d'avoir utilis� cet outil d'entra�nement contenant la plupart des op�rations logique en JAVA");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// AUTHOR
			System.out.println("by HACKA47");
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			reponse = ' ';
			// BOUCLE WHILE POUR RELANCER
			while (reponse != 'O' && reponse != 'N') {
				System.out.println("");
				System.out.println("Voulez-vous r�essayer et relancer la boucle DO WHILE du programme ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}
		}
		// FERMETURE BOUCLE DO WHILE
		while (reponse == 'O');
		sc.close();
		System.out.println("Au revoir " + nom + " et � bient�t...en JAVA");

	}

}
