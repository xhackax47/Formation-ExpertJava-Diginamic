package tppoo;

public class Carre extends Rectangle implements Surfacable {
	
	Point pointBasGauche;
	int cote;
	
	public Carre(Point p, int cote) {
		this.pointBasGauche = p;
		
		this.cote = cote;
		this.x = cote;
		this.y = cote;
		
	}

	@Override
	public String toString() {
		
		Point pointBasGauche = this.getPointBasGauche();
		Point pointBasDroit = new Point(pointBasGauche.getX(), pointBasGauche.getY() + cote);
		Point pointHautDroit = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY() + cote);
		Point pointHautGauche = new Point(pointBasGauche.getX() + cote, pointBasGauche.getY());
		
		String Bdroit = "[point=" + pointBasDroit + ", cote=" + cote + "]";
		String Hdroit = "[point=" + pointHautDroit + ", cote=" + cote + "]";
		String Bgauche = "[point=" + pointBasGauche + ", cote=" + cote + "]";
		String Hgauche = "[point=" + pointHautGauche + ", cote=" + cote + "]";
		
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
		return "CARRE";
	}
	
}
