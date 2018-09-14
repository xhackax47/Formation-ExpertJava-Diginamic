package tppoo;

public class Carre {
	
	Point pointBasGauche;
	int cote;
	
	public Carre(Point x, int y) {
		this.pointBasGauche = x;
		this.cote = y;
	}

	@Override
	public String toString() {
		
		Point pointBasDroit = new Point(pointBasGauche.getX(), pointBasGauche.getY() + cote);
		Point pointHautDroit = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY() + cote);
		Point pointHautGauche = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY());
		
		String Bdroit = "Carre [point=" + pointBasDroit + ", cote=" + cote + "]";
		String Hdroit = "Carre [point=" + pointHautDroit + ", cote=" + cote + "]";
		String Bgauche = "Carre [point=" + pointBasGauche + ", cote=" + cote + "]";
		String Hgauche = "Carre [point=" + pointHautGauche + ", cote=" + cote + "]";
		
		return Bdroit + Hdroit + Bgauche + Hgauche;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
}
