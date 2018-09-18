package tppoo;

import java.util.Collection;

import tppoo.Point;

public class VaultTec {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("LANCEMENT DU PROGRAMME VAULT-TEC...");

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// POINTS
		Point p = new Point(10, 10);
		System.out.println("OBJET p");
		System.out.println("");
		p.affiche();
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Point p2 = p.clone();
		System.out.println("CLONE DE POINT p = p2");
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

		System.out.println("VERIFICATION EGALITE POINTS p & p2");
		System.out.println("");
		if (p2.equals(p)) {
			System.out.println("P et P2 sont �gaux");
		} else {
			System.out.println("P et P2 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Point p3 = p.clone();
		System.out.println("VERIFICATION EGALITE POINTS p & p3");
		System.out.println("");
		if (p3.equals(p)) {
			System.out.println("P et P3 sont �gaux");
		} else {
			System.out.println("P et P3 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("VERIFICATION EGALITE POINTS p2 & p3");
		System.out.println("");
		if (p3.equals(p2)) {
			System.out.println("P3 et P2 sont �gaux");
		} else {
			System.out.println("P3 et P2 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// SEGMENTS
		Segment s = new Segment(p, 10, true);
		System.out.println("SEGMENT S");
		System.out.println("");
		s.affiche();
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// CARRE
		Carre c = new Carre(p, 20);
		System.out.println("OBJET c");
		System.out.println("");
		c.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE CARRE c = ");
		System.out.println(c.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// RONDS
		Rond r = new Rond(p, 5);
		System.out.println("OBJET r");
		System.out.println("");
		r.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE ROND r = ");
		System.out.println(r.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r2 = r.clone();
		System.out.println("CLONE DE ROND r = r2");
		System.out.println("");
		r2.setPoint(p2);
		r2.setRayon(6);
		r2.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE ROND r2 = ");
		System.out.println(r2.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("VERIFICATION EGALITE RONDS R & R2");
		System.out.println("");
		if (r2.equals(r)) {
			System.out.println("R et R2 sont �gaux");
		} else {
			System.out.println("R et R2 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r3 = r.clone();
		System.out.println("VERIFICATION EGALITE RONDS R & R3");
		System.out.println("");
		if (r.equals(r3)) {
			System.out.println("R et R3 sont �gaux");
		} else {
			System.out.println("R et R3 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("VERIFICATION EGALITE RONDS R2 & R3");
		System.out.println("");
		if (r2.equals(r3)) {
			System.out.println("R2 et R3 sont �gaux");
		} else {
			System.out.println("R2 et R3 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// RECTANGLES
		Rectangle rg = new Rectangle(p, 15, 20);
		System.out.println("OBJET rg");
		System.out.println("");
		rg.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE RG =");
		System.out.println(rg.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rectangle rg2 = rg.clone();
		System.out.println("CLONE DE RECTANGLE rg = rg2");
		System.out.println("");
		rg2.setPointBasGauche(p2);
		rg2.setX(30);
		rg2.setY(15);
		rg2.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE RG2 = ");
		System.out.println(rg2.surface());
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg2");
		System.out.println("");
		if (rg.equals(rg2)) {
			System.out.println("RG et RG2 sont �gaux");
		} else {
			System.out.println("RG et RG2 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rectangle rg3 = rg.clone();
		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg3");
		System.out.println("");
		if (rg3.equals(rg)) {
			System.out.println("RG et RG3 sont �gaux");
		} else {
			System.out.println("RG et RG3 ne sont pas �gaux");
		}
		System.out.println("");

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("VERIFICATION EGALITE RECTANGLES rg2 & rg3");
		System.out.println("");
		if (rg3.equals(rg2)) {
			System.out.println("RG2 et RG3 sont �gaux");
		} else {
			System.out.println("RG2 et RG3 ne sont pas �gaux");
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
		System.out.println("FIGURE PRESENTE A L'INDEX 0 : ");
		System.out.println("");
		System.out.println(figures[0]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 1 : ");
		System.out.println("");
		System.out.println(figures[1]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 2 : ");
		System.out.println("");
		System.out.println(figures[2]);

		try {
			Thread.sleep(0, 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 3 : ");
		System.out.println("");
		System.out.println(figures[3]);
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// GENERATION ALEATOIRE D'OBJETS
		System.out.println("Voici les objets g�n�r�s :");
		System.out.println("");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Rond r4 = FigureUtil.getRandomRond();
		System.out.println("Rond g�n�r� :");
		System.out.println("");
		r4.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE ROND GENERE R4 = ");
		System.out.println(r4.surface());

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");
		Rectangle rg4 = FigureUtil.getRandomRectangle();
		System.out.println("Rectangle g�n�r� RG4 :");
		System.out.println("");
		rg4.affiche();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE GENERE RG4 = ");
		System.out.println(rg4.surface());

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("");
		Segment s4 = FigureUtil.getRandomSegment();
		System.out.println("Segment g�n�r� :");
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
		System.out.println("Tri des figures g�n�r�es : ");
		System.out.println("");
		System.out.println(c2);

//		try {
//			Thread.sleep(3 * 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("");
//		System.out.println("Figure g�n�r�e la plus proche de z�ro");
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
		System.out.println("Attente de fermeture du programme...");

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("FIN DU PROGRAMME VAULT-TEC");
		System.out.println("");
	}

}
