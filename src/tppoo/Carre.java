package tppoo;

public class Carre extends Rectangle implements Surfacable {
	
	Point pointBasGauche;
	int cote;
	
	public Carre(Point p, int cote) {
		this(p, cote, Couleur.getCouleurDefault());	
	}

	public Carre(Point p, int cote, Couleur couleur) {
		super(p, cote, cote, couleur);
	}

	@Override
	public String toString() {
		
		Point pointBasGauche = this.getPointBasGauche();
		Point pointBasDroit = new Point(pointBasGauche.getX(), pointBasGauche.getY() + cote);
		Point pointHautDroit = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY() + cote);
		Point pointHautGauche = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY());
		
		String Bdroit = "[Point = " + pointBasDroit + ", Cote = " + cote + "]";
		String Hdroit = "[Point = " + pointHautDroit + ", Cote = " + cote + "]";
		String Bgauche = "[Point = " + pointBasGauche + ", Cote = " + cote + "]";
		String Hgauche = "[Point = " + pointHautGauche + ", Cote = " + cote + "]";
		
		return "[" + getType() + " " + Bdroit + Hdroit + Bgauche + Hgauche + "]";
	}
	
	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public void setPointBasGauche(Point pointBasGauche) {
		this.pointBasGauche = pointBasGauche;
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	protected String getType() {
		return "[CARRE]";
	}
	
}
