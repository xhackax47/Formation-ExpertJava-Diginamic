package tppoo;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Rectangle extends Figure implements Surfacable, Serializable {

	private static final long serialVersionUID = 2603039511620876733L;
	Point pointBasGauche;
	int x;
	int y;
	
	public Rectangle(Point pointBasGauche, int x, int y) {
		this(pointBasGauche, x, y, Couleur.getCouleurDefault());
	}

	public Rectangle(Point pointBasGauche, int x, int y, Couleur couleur) {
		super(couleur);
		this.pointBasGauche = pointBasGauche;
		this.x = x;
		this.y = y;
	}

	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public void setPointBasGauche(Point pointBasGauche) {
		this.pointBasGauche = pointBasGauche;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point getPointBasDroit() {
		Point result = new Point(pointBasGauche.getX(), pointBasGauche.getX() + y);
		return result;
	}

	public Point getPointHautDroit() {
		Point result = new Point(pointBasGauche.getX() + x, pointBasGauche.getX());
		return result;
	}

	public Point getPointHautGauche() {
		Point result = new Point(pointBasGauche.getX() + x, pointBasGauche.getX() + y);
		return result;
	}

	@Override
	public String toString() {
		return  getType() + "[Le pointBasGauche est égal à : " + pointBasGauche + ", x=" + x + ", y=" + y
				+ ", getPointBasGauche()=" + getPointBasGauche() + ", getPointBasDroit()=" + getPointBasDroit()
				+ ", getPointHautDroit()=" + getPointHautDroit() + ", getPointHautGauche()=" + getPointHautGauche()
				+ "]";
	}
	
	protected String getType() {
		return "[RECT] ";
	}

	@Override
	protected Rectangle clone() {
		return new Rectangle(this.pointBasGauche, this.x, this.y, this.getCouleur());
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return getPointBasGauche().equals(r.getPointBasGauche()) 
					&& getPointHautDroit().equals(r.getPointHautDroit());
		}
		return false;
	}

	@Override
	public Point getCentre() {
		int centrex = (pointBasGauche.getX() + getPointHautDroit().getX()) / 2;
		int centrey = (pointBasGauche.getY() + getPointHautDroit().getY()) / 2;
		return new Point(centrex, centrey);
	}

	@Override
	public double surface() {
		int largeur = this.x;
		int hauteur = this.y;
		return largeur * hauteur;
	}

	@Override
	public Iterator<Point> getPoints() {
		Collection<Point> c = new HashSet<>();
		c.add(getPointBasDroit());
		c.add(getPointBasGauche());
		c.add(getPointHautDroit());
		c.add(getPointHautGauche());
		return c.iterator();	
		}

	@Override
	public boolean couvre(Point p) {
		boolean couvreX = (getPointBasGauche().getX()<=p.getX()) && (p.getX()<= getPointBasDroit().getX());
		boolean couvreY = (getPointBasGauche().getY()<=p.getY()) && (p.getY()<= getPointHautGauche().getY());
		return couvreX && couvreY;
	}

//	@Override
//	public double distanceAZero() {
//		return Math.sqrt(pointBasGauche.getX()*pointBasGauche.getX() + pointBasGauche.getY()*pointBasGauche.getY());
//	}

}
