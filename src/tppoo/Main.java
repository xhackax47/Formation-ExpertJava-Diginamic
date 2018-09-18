package tppoo;

import java.util.Collection;

import tppoo.Point;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		// POINTS
		Point p = new Point(10, 10);
		System.out.println("OBJET p");
		System.out.println("");
		p.affiche();
		System.out.println("");

		Point p2 = p.clone();
		System.out.println("CLONE DE POINT p = p2");
		System.out.println("");
		p2.setX(20);
		p2.setY(20);
		p2.affiche();
		System.out.println("");

		System.out.println("VERIFICATION EGALITE POINTS p & p2");
		System.out.println("");
		if(p2.equals(p)) {
			System.out.println("P et P2 sont égaux");
			}else {
				System.out.println("P et P2 ne sont pas égaux");
			}
		System.out.println("");

		Point p3 = p.clone();
		System.out.println("VERIFICATION EGALITE POINTS p & p3");
		System.out.println("");
		if(p3.equals(p)) {
			System.out.println("P et P3 sont égaux");
			}else {
				System.out.println("P et P3 ne sont pas égaux");
			}
		System.out.println("");

		System.out.println("VERIFICATION EGALITE POINTS p2 & p3");
		System.out.println("");
		if(p3.equals(p2)) {
			System.out.println("P3 et P2 sont égaux");
			}else {
				System.out.println("P3 et P2 ne sont pas égaux");
			}
		System.out.println("");

		// SEGMENTS
		Segment s = new Segment(p, 10, true);
		System.out.println("SEGMENT S");
		System.out.println("");
		s.affiche();
		System.out.println("");

		// CARRE
		Carre c = new Carre(p, 20);
		System.out.println("OBJET c");
		System.out.println("");
		c.affiche();
		System.out.println("");
		System.out.println("SURFACE DE CARRE c = ");
		System.out.println(c.surface());
		System.out.println("");

		// RONDS
		Rond r = new Rond(p, 5);
		System.out.println("OBJET r");
		System.out.println("");
		r.affiche();
		System.out.println("");
		System.out.println("SURFACE DE ROND r = ");
		System.out.println(r.surface());
		System.out.println("");

		Rond r2 = r.clone();
		System.out.println("CLONE DE ROND r = r2");
		System.out.println("");
		r2.setPoint(p2);
		r2.setRayon(6);
		r2.affiche();
		System.out.println("");
		System.out.println("SURFACE DE ROND r2 = ");
		System.out.println(r2.surface());
		System.out.println("");

		System.out.println("VERIFICATION EGALITE RONDS R & R2");
		System.out.println("");
		if(r2.equals(r)) {
			System.out.println("R et R2 sont égaux");
			}else {
				System.out.println("R et R2 ne sont pas égaux");
			}
		System.out.println("");

		Rond r3 = r.clone();
		System.out.println("VERIFICATION EGALITE RONDS R & R3");
		System.out.println("");
		if(r.equals(r3)) {
			System.out.println("R et R3 sont égaux");
			}else {
				System.out.println("R et R3 ne sont pas égaux");
			}
		System.out.println("");

		System.out.println("VERIFICATION EGALITE RONDS R2 & R3");
		System.out.println("");
		if(r2.equals(r3)) {
			System.out.println("R2 et R3 sont égaux");
			}else {
				System.out.println("R2 et R3 ne sont pas égaux");
			}
		System.out.println("");

		// RECTANGLES
		Rectangle rg = new Rectangle(p, 15, 20);
		System.out.println("OBJET rg");
		System.out.println("");
		rg.affiche();
		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE RG =");
		System.out.println(rg.surface());
		System.out.println("");

		Rectangle rg2 = rg.clone();
		System.out.println("CLONE DE RECTANGLE rg = rg2");
		System.out.println("");
		rg2.setPointBasGauche(p2);
		rg2.setX(30);
		rg2.setY(15);
		rg2.affiche();
		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE RG2 = ");
		System.out.println(rg2.surface());
		System.out.println("");

		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg2");
		System.out.println("");
		if(rg.equals(rg2)) {
			System.out.println("RG et RG2 sont égaux");
			}else {
				System.out.println("RG et RG2 ne sont pas égaux");
			}
		System.out.println("");

		Rectangle rg3 = rg.clone();
		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg3");
		System.out.println("");
		if (rg3.equals(rg)) {
			System.out.println("RG et RG3 sont égaux");
		} else {
			System.out.println("RG et RG3 ne sont pas égaux");
		}
		System.out.println("");

		System.out.println("VERIFICATION EGALITE RECTANGLES rg2 & rg3");
		System.out.println("");
		if (rg3.equals(rg2)) {
			System.out.println("RG2 et RG3 sont égaux");
		} else {
			System.out.println("RG2 et RG3 ne sont pas égaux");
		}
		System.out.println("");
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
		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 1 : ");
		System.out.println("");
		System.out.println(figures[1]);
		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 2 : ");
		System.out.println("");
		System.out.println(figures[2]);
		System.out.println("");
		System.out.println("FIGURE PRESENTE A L'INDEX 3 : ");
		System.out.println("");
		System.out.println(figures[3]);
		System.out.println("");

		// GENERATION ALEATOIRE D'OBJETS
		System.out.println("Voici les objets générés R :");
		System.out.println("");
		Rond r4 = FigureUtil.getRandomRond();
		System.out.println("Rond généré :");
		System.out.println("");
		r4.affiche();
		System.out.println("");
		System.out.println("SURFACE DE ROND GENERE R4 = ");
		System.out.println(r4.surface());
		System.out.println("");
		System.out.println("");
		Rectangle rg4 = FigureUtil.getRandomRectangle();
		System.out.println("Rectangle généré RG4 :");
		System.out.println("");
		rg4.affiche();
		System.out.println("");
		System.out.println("SURFACE DE RECTANGLE GENERE RG4 = ");
		System.out.println(rg4.surface());
		System.out.println("");
		System.out.println("");
		Segment s4 = FigureUtil.getRandomSegment();
		System.out.println("Segment généré :");
		System.out.println("");
		s4.affiche();
		System.out.println("");
		System.out.println("");

		// GENERE
		System.out.println("Figures générées par methode genere : ");
		System.out.println("");
		Dessin d = new Dessin();
//		for (Figure f : FigureUtil.genere(10)) {
//			d.add(f);
//		}
		d.addAll(FigureUtil.genere(10));
		Collection<Figure> c2 = FigureUtil.trieDominant(d);
		System.out.println("Tri des figures générées : ");
		System.out.println("");
		System.out.println(c2);
		System.out.println("");
		System.out.println("Figure générée la plus proche de zéro");
		System.out.println("");
		Figure f3  = FigureUtil.procheZero(d);
		System.out.println(f3);
		System.out.println("");
		System.out.println("FIN DU PROGRAMME");
		System.out.println("");
	}

}
