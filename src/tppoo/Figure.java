
package tppoo;

import java.io.Serializable;
import java.util.Iterator;

public abstract class Figure implements Comparable<Figure>, Serializable{
	
	private static final long serialVersionUID = 3791990126557813882L;
	private static int maxId = 1;
	private int id;
	private Couleur couleur;
	
	private Figure() {
		this.id = maxId++;
	}
	
	public Figure(Couleur couleur) {
		this();
		this.setCouleur(couleur);
	}

	public String getKey() {
		return "" + id;
	}

	public void affiche() {
		System.out.println(this.toString());
//		System.out.println(toString());
	}

	public abstract Point getCentre();
	public abstract Iterator<Point> getPoints();
	public abstract boolean couvre(Point p);
	
	public double distanceAZero() {
		double min = -1;
		final Point zero = new Point();
		Iterator<Point> it = getPoints();
		while(it.hasNext()) {
			Point p = it.next();
			double d = p.distance(zero);	
			if(d<min || min==-1) {
				min = d;
			}
		}
		return min;
	}
	
	@Override
	public int compareTo(Figure f) {
		double dd = this.distanceAZero() - f.distanceAZero();
		return (dd == 0) ? 0 : ((dd < 0) ? -1 : 1 );
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
//	public Couleur getCouleur() {
//		return couleur;
//	}

}
