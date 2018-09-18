package tppoo;

import java.util.Collection;

import tppoo.Point;

public class MainVaultTec {

	public static void main(String[] args) throws CloneNotSupportedException {	
		
		System.out.println("");
		System.out.print("Bienvenue dans le programme de test de Vault-Tec");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");
		System.out.println("LANCEMENT DU PROGRAMME VAULT-TEC");
		System.out.println("");
		
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// POINTS
		Point p = new Point(10, 10);
		System.out.println("Création objet Point P...");
		System.out.println("");
		p.affiche();
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Point p2 = p.clone();
		System.out.println("Clone de point P = P2...");
		System.out.println("");
		p2.setX(20);
		p2.setY(20);
		p2.affiche();
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des points P & P2...");
		System.out.println("");
		if (p2.equals(p)) {
			System.out.println("P et P2 sont égaux");
		} else {
			System.out.println("P et P2 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Point p3 = p.clone();
		System.out.println("Vérification de l'égalité des points P & P3...");
		System.out.println("");
		if (p3.equals(p)) {
			System.out.println("P et P3 sont égaux");
		} else {
			System.out.println("P et P3 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des points P3 & P2...");
		System.out.println("");
		if (p3.equals(p2)) {
			System.out.println("P3 et P2 sont égaux");
		} else {
			System.out.println("P3 et P2 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// SEGMENTS
		Segment s = new Segment(p, 10, true, Couleur.BLEU);
		System.out.println("Création objet Segment S...");
		System.out.println("");
		s.affiche();
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// CARRE
		Carre c = new Carre(p, 20, Couleur.ROUGE);
		System.out.println("Création objet Carré C...");
		System.out.println("");
		c.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Carré C...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// RONDS
		Rond r = new Rond(p, 5, Couleur.JAUNE);
		System.out.println("Création objet Rond R...");
		System.out.println("");
		r.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rond R...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(r.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r2 = r.clone();
		System.out.println("Clone de Rond R = R2...");
		System.out.println("");
		r2.setPoint(p2);
		r2.setRayon(6);
		r2.setCouleur(Couleur.VERT);
		r2.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rond R2...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(r2.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des Ronds R & R2...");
		System.out.println("");
		if (r2.equals(r)) {
			System.out.println("R et R2 sont égaux");
		} else {
			System.out.println("R et R2 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r3 = r.clone();
		System.out.println("Vérification de l'égalité des Ronds R & R3...");
		System.out.println("");
		if (r.equals(r3)) {
			System.out.println("R et R3 sont égaux");
		} else {
			System.out.println("R et R3 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des Ronds R2 & R3...");
		System.out.println("");
		if (r2.equals(r3)) {
			System.out.println("R2 et R3 sont égaux");
		} else {
			System.out.println("R2 et R3 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// RECTANGLES
		Rectangle rg = new Rectangle(p, 15, 20, Couleur.JAUNE);
		System.out.println("Création de l'objet Rectangle RG...");
		System.out.println("");
		rg.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rectangle RG...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(rg.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rectangle rg2 = rg.clone();
		System.out.println("Clone de Rectangle RG = RG2");
		System.out.println("");
		rg2.setPointBasGauche(p2);
		rg2.setX(30);
		rg2.setY(15);
		rg2.setCouleur(Couleur.BLEU);
		rg2.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rectangle RG2...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(rg2.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des rectangles RG & RG2");
		System.out.println("");
		if (rg.equals(rg2)) {
			System.out.println("RG et RG2 sont égaux");
		} else {
			System.out.println("RG et RG2 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rectangle rg3 = rg.clone();
		System.out.println("Vérification de l'égalité des rectangles RG & RG3");
		System.out.println("");
		if (rg3.equals(rg)) {
			System.out.println("RG et RG3 sont égaux");
		} else {
			System.out.println("RG et RG3 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Vérification de l'égalité des rectangles RG2 & RG3");
		System.out.println("");
		if (rg3.equals(rg2)) {
			System.out.println("RG2 et RG3 sont égaux");
		} else {
			System.out.println("RG2 et RG3 ne sont pas égaux");
		}
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		// TABLEAUX
		System.out.println("");
		System.out.println("TABLEAUX");
		System.out.println("");
		Figure[] figures = new Figure[4];
		figures[0] = c;
		figures[1] = r;
		figures[2] = rg;
		figures[3] = s;
		System.out.println("Figure présente à l'index 0 : ");
		System.out.println("");
		System.out.println(figures[0]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Figure présente à l'index 1 : ");
		System.out.println("");
		System.out.println(figures[1]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Figure présente à l'index 2 : ");
		System.out.println("");
		System.out.println(figures[2]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Figure présente à l'index 3 : ");
		System.out.println("");
		System.out.println(figures[3]);
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// GENERATION ALEATOIRE D'OBJETS
		System.out.println("Voici les objets générés :");
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r4 = FigureUtil.getRandomRond();
		System.out.println("Rond généré :");
		System.out.println("");
		r4.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rond généré R4...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(r4.surface());

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");
		Rectangle rg4 = FigureUtil.getRandomRectangle();
		System.out.println("Rectangle généré RG4 :");
		System.out.println("");
		rg4.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("Calcul de la surface de Rectangle généré RG4...");
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(rg4.surface());

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");
		Segment s4 = FigureUtil.getRandomSegment();
		System.out.println("Segment généré :");
		System.out.println("");
		s4.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// METHODE GENERE
		Dessin d = new Dessin();
//		for (Figure f : FigureUtil.genere(10)) {
//			d.add(f);
//		}
		d.addAll(FigureUtil.genere(10));
		Collection<Figure> c2 = FigureUtil.trieDominant(d);
		System.out.println("Figures générées par méthode FigureUtil.genere(10) : ");
		System.out.println("");
		System.out.println(c2);

//		try {
//			Thread.sleep(3 * 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("");
//		System.out.println("Figure générée la plus proche de zéro");
//		System.out.println("");
//		Figure f3  = FigureUtil.procheZero(d);
//		System.out.println(f3);
//		System.out.println("");
		
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.print("Merci d'avoir utilisé notre programme Vault-Tec");
		
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("FERMETURE DU PROGRAMME");
		
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.checkError();
		System.out.flush();
		System.out.close();
	}
}