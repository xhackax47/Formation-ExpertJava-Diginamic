package tppoo;

import tppoo.Point;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// POINT
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
		System.out.println(p2.equals(p));
		System.out.println("");	
		
		Point p3 = p.clone();
		System.out.println("VERIFICATION EGALITE POINTS p & p3");
		System.out.println(p3.equals(p));
		System.out.println("");

		// ROND
		Rond r = new Rond(p, 5);
		System.out.println("OBJET r");
		System.out.println("");
		r.affiche();
		System.out.println("");

		Rond r2 = r.clone();
		System.out.println("CLONE DE ROND r = r2");
		System.out.println("");
		r2.setPoint(p2);
		r2.affiche();
		System.out.println("");
		
		System.out.println("VERIFICATION EGALITE RONDS r & r2");
		System.out.println(r2.equals(r));
		System.out.println("");	
		
		Rond r3 = r.clone();
		System.out.println("VERIFICATION EGALITE RONDS r & r3");
		System.out.println(r3.equals(r));
		System.out.println("");
		
		// RECTANGLE
		Rectangle rg = new Rectangle(p,15,20);
		System.out.println("OBJET rg");
		System.out.println("");
		rg.affiche();
		System.out.println("");

		Rectangle rg2 = rg.clone();
		System.out.println("CLONE DE RECTANGLE rg = rg2");
		System.out.println("");
		rg2.setPointBasGauche(p2);
		rg2.setX(30);
		rg2.setY(15);
		rg2.affiche();
		System.out.println("");
		
		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg2");
		System.out.println(rg2.equals(rg));
		System.out.println("");	
		
		Rectangle rg3 = rg.clone();
		System.out.println("VERIFICATION EGALITE RECTANGLES rg & rg3");
		System.out.println(rg3.equals(rg));
		System.out.println("");
	}

}
