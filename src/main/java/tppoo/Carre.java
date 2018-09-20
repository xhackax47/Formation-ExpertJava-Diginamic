package tppoo;

import java.io.Serializable;

public class Carre extends Rectangle implements Surfacable, Serializable {
	
	private static final long serialVersionUID = 7573653943439978925L;
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
		
		return super.toString();
		
//		Point pointBasGauche = this.getPointBasGauche();
//		Point pointBasDroit = new Point(getPointBasGauche().getX(), getPointBasGauche().getY() + cote);
//		Point pointHautDroit = new Point(getPointBasGauche().getX() + cote, getPointBasGauche().getY() + cote);
//		Point pointHautGauche = new Point(getPointBasGauche().getX() + cote, getPointBasGauche().getY());
//		
//		String Bdroit = "[Point = " + pointBasDroit + ", Cote = " + cote + "]";
//		String Hdroit = "[Point = " + pointHautDroit + ", Cote = " + cote + "]";
//		String Bgauche = "[Point = " + pointBasGauche + ", Cote = " + cote + "]";
//		String Hgauche = "[Point = " + pointHautGauche + ", Cote = " + cote + "]";
//		
//		return "[" + getType() + " " + Bdroit + Hdroit + Bgauche + Hgauche + "]";
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
