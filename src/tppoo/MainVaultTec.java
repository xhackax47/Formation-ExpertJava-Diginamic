package tppoo;

import java.io.File;
import java.io.IOException;
//import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import tppoo.Point;

public class MainVaultTec {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws CloneNotSupportedException, IOException, InterruptedException {

		// VARIABLES UTILISES PAR LE PROGRAMME
		Scanner sc = new Scanner(System.in); // Creation objet scanner pour capture clavier

		// VARIABLES DE STRING ET CHAR
		String id;
		char reponse = 'O'; // Char initialisé à "O" pour entrer dans la boucle DO WHILE
		String space = "";
		String point = ".";
		String vlt = "VAULT-TEC";
		String emp = "Employé";
		String wlcm = "Bienvenue chez " + vlt;
		String bye ="Au revoir";
		String verifId = "VERIFICATION IDENTITE " + vlt;
		String scanId = "Veuillez entrer votre ID-" + emp + " " + vlt;
		String soonLaunch = "Le programme " + vlt + " va bientôt démarrer, " +  emp + " n°";
		String launch = "LANCEMENT DU PROGRAMME " + vlt;
		String merci = "Merci d'avoir utilisé notre programme " + vlt;
		String close = "FERMETURE DU PROGRAMME " + vlt;
		String verifEqual = "Vérification de l'égalité entre ";
		String calculSurface= "Calcul de la surface de ";
		String createObj = "Création objet ";
		String clone = "Clone de ";
		String equals = " sont égaux";
		String notEquals = " ne sont pas égaux";
		String ca = "Carré";
		String pt = "Point";
		String rgl = "Rectangle";
		String rd = "Rond";
		String sgt = "Segment";
		String fg = "Figure";
		String col = "Couleur";
		String retry = ", voulez-vous relancer le programme " + vlt + " ? (O/N)";

		// VARIABLES DE PAUSES
		int pa1 = 1 * 1000;
		int pa2 = 2 * 1000;
		int pa3 = 3 * 1000;
		int pa4 = 4 * 1000;
		int pa5 = 5 * 1000;
		int pa6 = 6 * 1000;
		int pa7 = 7 * 1000;
		int pa8 = 8 * 1000;
		int pa9 = 9 * 1000;
		int pa10 = 10 * 1000;
		int pa15 = 15 * 1000;
		int pa20 = 20 * 1000;
		int pa30 = 30 * 1000;
		int pa40 = 40 * 1000;
		int pa50 = 50 * 1000;
		int pa100 = 100 * 1000;
		int pa200 = 200 * 1000;
		int pa500 = 500 * 1000;
		int pa1000 = 1000 * 1000;
		double pa05 = 0.5 * 1000;
		double pa01 = 0.1 * 1000;

		// DEBUT DU PROGRAMME
		do {

			System.out.println(space);
			System.out.print(wlcm);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep(pa1);

			// INTRO ET ENTREE NOM USER
			System.out.println(space);
			System.out.println(space);
			System.out.println(verifId);
			System.out.println(space);
			System.out.println(scanId);
			System.out.println(space);
			id = sc.nextLine();
			System.out.println(space);
			System.out.println(soonLaunch + id);
			System.out.println(space);
			System.out.println(launch);
			System.out.println(space);

			Thread.sleep(pa10);

			// POINTS
			Point p = new Point(10, 10);
			System.out.println(createObj + pt + " P...");
			System.out.println(space);
			p.affiche();
			System.out.println(space);

			Thread.sleep(pa1);

			Point p2 = p.clone();
			System.out.println(clone + pt + " P = P2...");
			System.out.println(space);
			p2.setX(20);
			p2.setY(20);
			p2.affiche();
			System.out.println(space);

			Thread.sleep(pa1);

			System.out.println(verifEqual + "P & P2...");
			System.out.println(space);

			if (p2.equals(p)) {
				System.out.println("P et P2" + equals);
			} else {
				System.out.println("P et P2" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			Point p3 = p.clone();
			System.out.println(verifEqual + "P & P3...");
			System.out.println(space);

			if (p3.equals(p)) {
				System.out.println("P et P3" + equals);
			} else {
				System.out.println("P et P3" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			System.out.println(verifEqual + "P3 & P2...");
			System.out.println(space);

			if (p3.equals(p2)) {
				System.out.println("P3 et P2" + equals);
			} else {
				System.out.println("P3 et P2" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			// SEGMENTS
			Segment s = new Segment(p, 10, true, Couleur.BLEU);
			System.out.println(createObj + sgt + " S...");
			System.out.println(space);
			s.affiche();
			System.out.println(space);

			Thread.sleep(pa1);

			// CARRE
			Carre c = new Carre(p, 20, Couleur.ROUGE);
			System.out.println(createObj + ca + " C...");
			System.out.println(space);
			c.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + ca + " C...");

			Thread.sleep(pa1);

			System.out.println(c.surface());
			System.out.println(space);

			Thread.sleep(pa1);

			// RONDS
			Rond r = new Rond(p, 5, Couleur.JAUNE);
			System.out.println(createObj + rd + " R...");
			System.out.println(space);
			r.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rd + " R...");

			Thread.sleep(pa4);

			System.out.println(r.surface());
			System.out.println(space);

			Thread.sleep(pa1);

			Rond r2 = r.clone();
			System.out.println(clone + rd + " R = R2...");
			System.out.println(space);
			r2.setPoint(p2);
			r2.setRayon(6);
			r2.setCouleur(Couleur.VERT);
			r2.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rd + " R2...");

			Thread.sleep(pa4);

			System.out.println(r2.surface());
			System.out.println(space);

			Thread.sleep(pa1);

			System.out.println(verifEqual + "R & R2...");
			System.out.println(space);

			r2.equals(r);

			System.out.println(space);

			Thread.sleep(pa2);

			Rond r3 = r.clone();
			System.out.println(verifEqual + "R & R3...");
			System.out.println(space);
			r.equals(r3);
			System.out.println(space);

			Thread.sleep(pa2);

			System.out.println(verifEqual + "R2 & R3...");
			System.out.println(space);
			r2.equals(r3);
			System.out.println(space);

			Thread.sleep(pa2);

			// RECTANGLES
			Rectangle rg = new Rectangle(p, 15, 20, Couleur.JAUNE);
			System.out.println(createObj + rgl + " RG...");
			System.out.println(space);
			rg.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rgl + " RG...");

			Thread.sleep(pa4);

			System.out.println(rg.surface());
			System.out.println(space);

			Thread.sleep(pa1);

			Rectangle rg2 = rg.clone();
			System.out.println(clone + rgl + " RG = RG2");
			System.out.println(space);
			rg2.setPointBasGauche(p2);
			rg2.setX(30);
			rg2.setY(15);
			rg2.setCouleur(Couleur.BLEU);
			rg2.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rgl + " RG2...");

			Thread.sleep(pa4);

			System.out.println(rg2.surface());
			System.out.println(space);

			Thread.sleep(pa1);

			System.out.println(verifEqual + "RG & RG2");
			System.out.println(space);

			if (rg.equals(rg2)) {
				System.out.println("RG et RG2" + equals);
			} else {
				System.out.println("RG et RG2" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			Rectangle rg3 = rg.clone();
			System.out.println(verifEqual + "RG & RG3");
			System.out.println(space);

			if (rg3.equals(rg)) {
				System.out.println("RG et RG3" + equals);
			} else {
				System.out.println("RG et RG3" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			System.out.println(verifEqual + "RG2 & RG3");
			System.out.println(space);

			if (rg3.equals(rg2)) {
				System.out.println("RG2 et RG3" + equals);
			} else {
				System.out.println("RG2 et RG3" + notEquals);
			}

			System.out.println(space);

			Thread.sleep(pa2);

			// TABLEAUX
			System.out.println(space);
			System.out.println("TABLEAUX");
			System.out.println(space);
			Figure[] figures = new Figure[4];
			figures[0] = c;
			figures[1] = r;
			figures[2] = rg;
			figures[3] = s;
			System.out.println(fg + " présente à l'index 0 : ");
			System.out.println(space);
			System.out.println(figures[0]);

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(fg + " présente à l'index 1 : ");
			System.out.println(space);
			System.out.println(figures[1]);

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(fg + " présente à l'index 2 : ");
			System.out.println(space);
			System.out.println(figures[2]);

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(fg + " présente à l'index 3 : ");
			System.out.println(space);
			System.out.println(figures[3]);
			System.out.println(space);

			Thread.sleep(pa1);

			// GENERATION ALEATOIRE D'OBJETS
			System.out.print("Génération d'objets");
			Thread.sleep(pa1);
			System.out.print(point);
			Thread.sleep(pa1);
			System.out.print(point);
			Thread.sleep(pa1);
			System.out.print(point);
			System.out.println(space);
			System.out.println(space);

			Thread.sleep((long) pa05);
			Rond r4 = FigureUtil.getRandomRond();
			System.out.println(rd + " généré :");
			System.out.println(space);
			r4.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rd + " généré R4...");

			Thread.sleep(pa4);

			System.out.println(r4.surface());

			Thread.sleep(pa1);

			System.out.println(space);
			Rectangle rg4 = FigureUtil.getRandomRectangle();
			System.out.println(rgl + " généré RG4 :");
			System.out.println(space);
			rg4.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(calculSurface + rgl + " généré RG4...");

			Thread.sleep(pa4);

			System.out.println(rg4.surface());

			Thread.sleep(pa1);

			System.out.println(space);
			Segment s4 = FigureUtil.getRandomSegment();
			System.out.println(sgt + " généré :");
			System.out.println(space);
			s4.affiche();

			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(space);

			Thread.sleep(pa3);

			// METHODE GENERE
			Dessin d = new Dessin();
//			for (Figure f : FigureUtil.genere(10)) {
//			d.add(f);
//			}
			d.addAll(FigureUtil.genere(5));
			Collection<Figure> c2 = FigureUtil.trieDominant(d);
//			Collection<String> c3 = Arrays.asList("TestStream1", "TestStream2", "TestStream3", "TestStream4" );
//			// API STREAM
//			c3.stream()
//			.filter(x -> x.contains("st"));
			
			System.out.print("Génération de figures par méthode FigureUtil.genere(10)");
			Thread.sleep(pa1);
			System.out.print(point);
			Thread.sleep(pa1);
			System.out.print(point);
			Thread.sleep(pa1);
			System.out.print(point);
			System.out.println(space);
			System.out.println(c2);
			Thread.sleep(pa3);
			System.out.println(space);
			System.out.println(space);
		
//			System.out.println("");
//			System.out.println(fg +" générée la plus proche de zéro");
//			System.out.println("");
//			Figure f3  = FigureUtil.procheZero(d);
//			System.out.println(f3);
//			System.out.println("");
			
			//UTILISATION DE L'EXCEPTION CREE

			try {
				FigureUtil.imprime(d);
				FigureUtil.sauvegarde(d, File.createTempFile("save", ".txt"));
			} catch (ImpressionHorsLimiteException ex) {
				System.out.println("Impression hors limite " + ex.getMessage());
			} catch (IOException ex) {
				System.out.println("Erreur à l'écriture du fichier de sauvegarde" + ex.getMessage());
			}
			
			Thread.sleep(pa1);
			
//			Thread t = new Thread(new Runnable() {
//				public void run() {
//					;;;;;;
//				}
//			});
//			t.start();

			Thread.sleep(pa2);

			System.out.println(space);
			System.out.print(merci);

			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep((long) pa05);
			System.out.print(point);
			Thread.sleep(pa1);

			System.out.println(space);
			System.out.println(space);
			System.out.println(close);
			System.out.println(space);
			System.out.println(space);

			reponse = ' ';
			
			// BOUCLE WHILE POUR RELANCER
			while (reponse != 'O' && reponse != 'N') {
				System.out.println(emp + " n°" + id + retry);
				reponse = sc.nextLine().charAt(0);
			}
			
			System.out.checkError();
		}
		
		// FERMETURE BOUCLE DO WHILE
		while (reponse == 'O');
		sc.close();
		System.out.println(bye + ", " + emp + "n°" + id + " et à bientôt chez " + vlt);
		
		System.out.checkError();
		System.out.flush();
		System.out.close();
	}
	
}