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
		
		String Bdroit = "[point=" + pointBasDroit + ", cote=" + cote + "]";
		String Hdroit = "[point=" + pointHautDroit + ", cote=" + cote + "]";
		String Bgauche = "[point=" + pointBasGauche + ", cote=" + cote + "]";
		String Hgauche = "[point=" + pointHautGauche + ", cote=" + cote + "]";
		
		return "[" + getType() + " " + Bdroit + Hdroit + Bgauche + Hgauche + "]";
	}
	
	protected String getType() {
		return "CARRE";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
}
