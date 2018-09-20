package tp;

import java.util.Scanner;

public class TpJavaApprocheImperative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// JAVA 01
		
		String p1 = args[0];
		String p2 = args[1];
		String p3 = args[2];
		
		System.out.println("TP DU COURS JAVA DIGINAMIC");
		System.out.println("");
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TP JAVA 01");
		System.out.println("");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ARGUMENTS");
		System.out.println("");
		System.out.println("Argument args0 = " + p1);
		System.out.println("Argument args1 = " + p2);
		System.out.println("Argument args2 = " + p3);
		System.out.println("");
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// JAVA 02
		
		Integer a1 = 1234;
		Integer b1 = 123456789;
		Float f1 = (float) a1;
		Float f2 = (float) b1;
		Float x = (float) 15;
		Float z = (float) 0;
		Float y = (float) -123;
		Float a = x / z;
		Float b = y / z;
		Float c = a / b;
		
		System.out.println("TP JAVA 02");
		System.out.println("");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("VARIABLES");
		System.out.println("");
		System.out.println("Variable a = " + a1);
		System.out.println("Variable b = " + b1);
		System.out.println("Variable f1 = " + f1);
		System.out.println("Variable f2 = " + f2);
		System.out.println("Variable x = " + x);
		System.out.println("Variable z = " + z);
		System.out.println("Variable y = " + y);
		System.out.println("Variable a = " + a);
		System.out.println("Variable b = " + b);
		System.out.println("Variable c = " + c);
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// JAVA 03
		
		byte b2 = 10;
		b2 += 1000;
		
		System.out.println("");
		System.out.println("TP JAVA 03");
		System.out.println("");
		System.out.println("Variable b2 = " + b2);

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// JAVA04
		
		double remise;
		short pcremise = 0;
		
		System.out.println("");
		System.out.println("TP JAVA 04");
		System.out.println("");
		System.out.println("Entrez le montant : ");
		double montant = sc.nextDouble();
		System.out.println("");
		System.out.println("Calcul en cours....");
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (montant < 1000) {
			remise = 0;
		}

		else if (montant < 2000) {
			pcremise = 1;
		}

		else if (montant < 5000) {
			pcremise = 3;
		}

		else {
			pcremise = 5;
		}
		remise = montant * pcremise / 100;

		System.out.println("La remise est de " + pcremise + "% et le montant total est de " + montant + "�");
		System.out.println("Le montant de la remise est donc de :" + remise + "�");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// JAVA05
		System.out.println("");
		System.out.println("TP JAVA 05");
		System.out.println("");
		System.out.println("Entrez la taille : ");
		byte taille = sc.nextByte();
		System.out.println("");
		System.out.println("Calcul en cours....");
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (taille < 1) {
			System.out.println("Taille invalide");
		}

		else {
			switch (taille) {
			case 1:
				System.out.println("PETITE TAILLE");
				break;

			case 2:
				System.out.println("MOYENNE TAILLE");
				break;

			default:
				System.out.println("GRANDE TAILLE");
				break;
			}
		}
		
		// JAVA06
		System.out.println("");
		System.out.println("TP JAVA 06");
		System.out.println("");
		System.out.println("Entrez le chiffre : ");
		Integer chiffre = sc.nextInt();
		System.out.println("");
		int count = 0;
		System.out.println("Calcul en cours....");
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while(count <= chiffre) {
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Le compte est � : " + count);
			count++;
		}
		
		//JAVA 07
		System.out.println("");
		System.out.println("TP JAVA 07");
		System.out.println("");
		
		for (int secondes = 20; secondes > 0; secondes--) {
			System.out.println(secondes + " secondes restantes");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("");
		System.out.println("Fin de la boucle FOR TP JAVA07-1");
		
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Integer n = 10;
		Integer m = 1;
		
		for(int i=2;i<=n;i++) {
			m=m*i;
			//m*=i
		}
		
		System.out.println("");
		System.out.println("La factorielle de 10 est : " + m);
		System.out.println("");
		System.out.println("Fin de la boucle FOR TP JAVA07-2");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Integer valeur = 2;
		Integer compteur = 0;
		String nbrePremier ="";
		
		System.out.println("");
		System.out.println("Nombres premiers");
		System.out.println("");
		System.out.println("Combien voulez-vous de nombres entiers � partir de 2 : ");
		System.out.println("");	
		Integer nombre =  sc.nextInt();
		System.out.println("Calcul en cours....");
		System.out.println("");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		while(compteur < nombre) {
			boolean estPremier = true;
			
			for(int diviseur = 2; diviseur < valeur; diviseur++) {
				if(valeur % diviseur == 0) {
					estPremier = false;
					break;
				}
			}
			
			if(estPremier) {
				if(!"".equals(nbrePremier)) {
					nbrePremier += ", ";
				}
				nbrePremier += valeur;
				compteur++;
			}
			
			valeur++;
		}
		
		System.out.println("Les " + nombre + " premiers nombre premiers sont : " + nbrePremier);
		
		//FIN PROGRAMME
		sc.close();
		System.out.println("");
		System.out.println("FIN DES TP JAVA DIGINAMIC");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.println("Au revoir�");
	}
	
//	public static boolean estPremier(int nombre) {
//		boolean estPremier = true;
//		
//		for(int diviseur = 2; diviseur < nombre; diviseur++) {
//			if(nombre % diviseur == 0) {
//				estPremier = false;
//				break;
//			}
//		}
//		
//		return true;
//		
//	}
}
